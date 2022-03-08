package com.erick.mutwiri.api.hateoas;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.erick.mutwiri.api.controllers.CardController;
import com.erick.mutwiri.api.entity.CardEntity;
import com.erick.mutwiri.api.model.Card;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class CardRepresentationModelAssembler extends RepresentationModelAssemblerSupport<CardEntity, Card> {

    public CardRepresentationModelAssembler() {
        super(CardController.class, Card.class);
    }


    @Override
    public Card toModel(CardEntity entity) {
        // String uid = Objects.nonNull(entity.getUser()) ? entity.getUser().getId().toString() : null;
        Card resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.cardNumber(entity.getNumber()).ccv(entity.getCvv()).expires(entity.getExpires());
        resource.add(linkTo(methodOn(CardController.class).getCardById(entity.getId().toString())).withSelfRel());
        return resource;
    }

    public List<Card> toListModel(Iterable<CardEntity> entities) {
        if(Objects.isNull(entities)) return Collections.emptyList();
        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e)).collect(Collectors.toList());
    }
    
}
