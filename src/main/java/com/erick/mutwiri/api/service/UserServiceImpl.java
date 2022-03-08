package com.erick.mutwiri.api.service;

import java.util.Optional;
import java.util.UUID;

import com.erick.mutwiri.api.entity.AddressEntity;
import com.erick.mutwiri.api.entity.CardEntity;
import com.erick.mutwiri.api.entity.UserEntity;
import com.erick.mutwiri.api.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteCustomerById(String id) {
        repository.deleteById(UUID.fromString(id));        
    }

    @Override
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id) {
        return repository.findById(UUID.fromString(id)).map(UserEntity::getAddresses);
    }

    @Override
    public Iterable<UserEntity> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Optional<CardEntity> getCardsByCustomerId(String id) {
        return Optional.of(repository.findById(UUID.fromString(id)).map(UserEntity::getCards).get().get(0));
    }

    @Override
    public Optional<UserEntity> getCustomerById(String id) {
        return repository.findById(UUID.fromString(id));
    }
    
}
