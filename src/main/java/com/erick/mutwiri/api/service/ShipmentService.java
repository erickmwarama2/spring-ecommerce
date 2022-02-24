package com.erick.mutwiri.api.service;

import javax.validation.constraints.Min;

import com.erick.mutwiri.api.entity.ShipmentEntity;

public interface ShipmentService {
    
    public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(
        value = 1L,
        message = "Invalid product ID."
    ) String id);
}
