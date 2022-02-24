package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.CardEntity;

import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardEntity, UUID> {
    
}
