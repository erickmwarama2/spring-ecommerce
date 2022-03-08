package com.erick.mutwiri.api.hateoas;

import com.erick.mutwiri.api.controllers.AddressController;
import com.erick.mutwiri.api.entity.AddressEntity;
import com.erick.mutwiri.api.model.Address;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

@Component
public class AddressRepresentationModelAssembler extends RepresentationModelAssemblerSupport<AddressEntity, Address> {

    public AddressRepresentationModelAssembler() {
        super(AddressController.class, Address.class);
    }

    @Override
    public Address toModel(AddressEntity entity) {
        Address resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        //resource.setId
        resource.add(
            linkTo(methodOn(AddressController.class).getAddressesById(entity.getId().toString())).withSelfRel()
        );

        return resource;
    }

    public List<Address> toListModel(Iterable<AddressEntity> entities) {
        if(Objects.isNull(entities)){
            return Collections.emptyList();
        }

        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e))
        .collect(Collectors.toList());
    }
    
}
