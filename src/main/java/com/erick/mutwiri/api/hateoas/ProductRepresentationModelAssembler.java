package com.erick.mutwiri.api.hateoas;

import com.erick.mutwiri.api.controllers.ProductController;
import com.erick.mutwiri.api.entity.ProductEntity;
import com.erick.mutwiri.api.model.Product;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ProductRepresentationModelAssembler extends RepresentationModelAssemblerSupport<ProductEntity, Product> {

    public ProductRepresentationModelAssembler() {
        super(ProductController.class, Product.class);
    }

    @Override
    public Product toModel(ProductEntity entity) {
        Product resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.setId(entity.getId().toString());
        // resource.setTag(
        //     entity.getTags().stream().map(t -> new Tag
        // );

        resource.add(linkTo(methodOn(ProductController.class).getProduct(entity.getId().toString())).withSelfRel());
        resource.add(linkTo(methodOn(ProductController.class).queryProducts(null, null, 1, 10)).withRel("products"));
        return resource;
    }

    public List<Product> toListModel(Iterable<ProductEntity> entities) {
        if(Objects.isNull(entities)){
            return Collections.emptyList();
        }

        return StreamSupport.stream(entities.spliterator(), false).map(p -> toModel(p)).collect(Collectors.toList());
    }
    
}
