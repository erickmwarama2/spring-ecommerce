package com.erick.mutwiri.api.service;

import java.util.Optional;

import com.erick.mutwiri.api.entity.AddressEntity;
import com.erick.mutwiri.api.entity.CardEntity;
import com.erick.mutwiri.api.entity.UserEntity;

public interface UserService {

    public void deleteCustomerById(String id);
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
    public Iterable<UserEntity> getAllCustomers();
    public Optional<CardEntity> getCardsByCustomerId(String id);
    public Optional<UserEntity> getCustomerById(String id);
    
}
