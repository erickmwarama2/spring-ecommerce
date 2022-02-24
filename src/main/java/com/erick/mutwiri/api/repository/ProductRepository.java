package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.ProductEntity;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
    
}
