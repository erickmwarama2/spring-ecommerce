package com.erick.mutwiri.api.hateoas;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.erick.mutwiri.api.controllers.CartController;
import com.erick.mutwiri.api.entity.CartEntity;
import com.erick.mutwiri.api.model.Cart;
import com.erick.mutwiri.api.service.ItemService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class CartRepresentationModelAssembler extends RepresentationModelAssemblerSupport<CartEntity, Cart> {

    private ItemService itemService;

    public CartRepresentationModelAssembler(ItemService itemService) {
        super(CartController.class, Cart.class);
        this.itemService = itemService;
    }

    @Override
    public Cart toModel(CartEntity entity) {
        String uid = Objects.nonNull(entity.getUser()) ? entity.getUser().getId().toString() : null;
        // String cid = Objects.nonNull(entity.getId())? entity.getId().toString() : null;

        Cart resource = new Cart();
        BeanUtils.copyProperties(entity, resource);
        resource.customerId(uid).items(itemService.toModelList(entity.getItems()));
        resource.add(linkTo(methodOn(CartController.class).getCartByCustomerId(uid)).withSelfRel());
        resource.add(linkTo(methodOn(CartController.class).getCartItemsByCustomerId(uid.toString())).withRel("cart-items"));
        return resource;
    }

    public List<Cart> toListModel(Iterable<CartEntity> entities) {
        if(Objects.isNull(entities)) {
            return Collections.emptyList();
        }
        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e)).collect(Collectors.toList());
    }
    
}
