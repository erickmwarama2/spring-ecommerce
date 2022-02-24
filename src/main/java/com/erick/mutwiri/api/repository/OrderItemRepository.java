package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.OrderItemEntity;

import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
    
}
