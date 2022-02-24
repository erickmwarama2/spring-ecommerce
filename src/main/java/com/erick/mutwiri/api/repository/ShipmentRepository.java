package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.ShipmentEntity;

import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
    
}
