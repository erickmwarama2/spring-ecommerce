package com.erick.mutwiri.api.hateoas;

import com.erick.mutwiri.api.controllers.PaymentController;
import com.erick.mutwiri.api.entity.PaymentEntity;
import com.erick.mutwiri.api.model.Payment;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class PaymentRepresentationModelAssembler extends RepresentationModelAssemblerSupport<PaymentEntity, Payment> {

    public PaymentRepresentationModelAssembler() {
        super(PaymentController.class, Payment.class);
    }

    @Override
    public Payment toModel(PaymentEntity entity) {
        Payment resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.add(linkTo(methodOn(PaymentController.class).getOrdersPaymentAuthorization(entity.getId().toString())).withSelfRel());
        return resource;
    }

    public List<Payment> toListModel(Iterable<PaymentEntity> entities) {
        if(Objects.isNull(entities)){
            return Collections.emptyList();
        }

        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e)).collect(Collectors.toList());
    }
    
}
