package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.erick.mutwiri.api.AddressApi;
import com.erick.mutwiri.api.hateoas.AddressRepresentationModelAssembler;
import com.erick.mutwiri.api.model.AddAddressReq;
import com.erick.mutwiri.api.model.Address;
import com.erick.mutwiri.api.service.AddressService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AddressController implements AddressApi {
    
    private AddressService service;
    private final AddressRepresentationModelAssembler assembler;

    public AddressController(AddressService addressService, AddressRepresentationModelAssembler assembler) {
        this.service = addressService;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Address> createAddress(@Valid AddAddressReq addAddressReq) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
            service.createAddress(addAddressReq).map(assembler::toModel).get()
        );
    }

    @Override
    public ResponseEntity<Void> deleteAddressesById(String id) {
        service.deleteAddressesById(id);
        return ResponseEntity.accepted().build();
    }

    @Override
    public ResponseEntity<Address> getAddressesById(String id) {
        return service.getAddressesById(id).map(assembler::toModel)
        .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Address>> getAllAddresses() {
        return ResponseEntity.ok(assembler.toListModel(service.getAllAddresses()));
    }
}
