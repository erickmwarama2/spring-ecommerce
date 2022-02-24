package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.AddressEntity;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
    
}
