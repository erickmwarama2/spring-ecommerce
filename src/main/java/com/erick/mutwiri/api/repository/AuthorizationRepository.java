package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.AuthorizationEntity;

import org.springframework.data.repository.CrudRepository;

public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity,UUID> {
    
}
