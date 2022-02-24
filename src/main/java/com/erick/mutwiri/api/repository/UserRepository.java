package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {
    
}
