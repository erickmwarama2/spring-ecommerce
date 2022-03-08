package com.erick.mutwiri.api.service;

import java.util.Arrays;
import java.util.UUID;

import javax.validation.constraints.Min;

import com.erick.mutwiri.api.entity.ShipmentEntity;
import com.erick.mutwiri.api.repository.ShipmentRepository;

import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {
    
    private ShipmentRepository repository;

    public ShipmentServiceImpl(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1, message = "Invalid product ID.") String id) {
        return repository.findAllById(Arrays.asList(UUID.fromString(id)));
    }
    
}
