package com.erick.mutwiri.api.hateoas;

import com.erick.mutwiri.api.controllers.CustomerController;
import com.erick.mutwiri.api.entity.UserEntity;
import com.erick.mutwiri.api.model.User;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class UserRepresentationModelAssembler extends RepresentationModelAssemblerSupport<UserEntity, User> {

    public UserRepresentationModelAssembler() {
        super(CustomerController.class, User.class);
    }

    @Override
    public User toModel(UserEntity entity) {
        User resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        // resource.setId(entity.getId().toString());
        resource.add(linkTo(methodOn(CustomerController.class).getCustomerById(entity.getId().toString())).withSelfRel());
        resource.add(linkTo(methodOn(CustomerController.class).getAllCustomers()).withRel("customers"));
        resource.add(linkTo(methodOn(CustomerController.class).getAddressesByCustomerId(entity.getId().toString())).withRel("self_addresses"));
        return resource;
    }

    public List<User> toListModel(Iterable<UserEntity> entities) {
        if(Objects.isNull(entities)){
            return Collections.emptyList();
        }

        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e)).collect(Collectors.toList());
    }
    
}
