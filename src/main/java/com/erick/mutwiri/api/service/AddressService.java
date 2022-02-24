package com.erick.mutwiri.api.service;

import java.util.Optional;

import com.erick.mutwiri.api.entity.AddressEntity;
import com.erick.mutwiri.api.model.AddAddressReq;

public interface AddressService {
    
    public Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);
    public void deleteAddressesById(String id);
    public Optional<AddressEntity> getAddressesById(String id);
    public Iterable<AddressEntity> getAllAddresses();
}
