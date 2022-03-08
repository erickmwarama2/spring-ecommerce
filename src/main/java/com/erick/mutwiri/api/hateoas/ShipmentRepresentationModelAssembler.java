package com.erick.mutwiri.api.hateoas;

import com.erick.mutwiri.api.controllers.ShipmentController;
import com.erick.mutwiri.api.entity.ShipmentEntity;
import com.erick.mutwiri.api.model.Shipment;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ShipmentRepresentationModelAssembler extends RepresentationModelAssemblerSupport<ShipmentEntity, Shipment> {

    public ShipmentRepresentationModelAssembler() {
        super(ShipmentController.class, Shipment.class);
    }

    @Override
    public Shipment toModel(ShipmentEntity entity) {
        Shipment resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.add(linkTo(methodOn(ShipmentController.class).getShipmentByOrderId(entity.getId().toString())).withRel("byOrderId"));
        return resource;
    }

    public List<Shipment> toListModel(Iterable<ShipmentEntity> entities) {
        if(Objects.isNull(entities)) return Collections.emptyList();
        return StreamSupport.stream(entities.spliterator(), false).map(e -> toModel(e)).collect(Collectors.toList());
    }
    
}
