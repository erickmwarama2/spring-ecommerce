package com.erick.mutwiri.api.repository;

import java.util.UUID;

import com.erick.mutwiri.api.entity.TagEntity;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<TagEntity, UUID> {
    
}
