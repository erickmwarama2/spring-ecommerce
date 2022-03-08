package com.erick.mutwiri.api.controllers;

import java.util.List;

import com.erick.mutwiri.api.CustomerApi;
import com.erick.mutwiri.api.model.Address;
import com.erick.mutwiri.api.model.Card;
import com.erick.mutwiri.api.model.User;

import org.springframework.http.ResponseEntity;

public class CustomerController implements CustomerApi {

    @Override
    public ResponseEntity<Void> deleteCustomerById(String id) {
        // TODO Auto-generated method stub
        return CustomerApi.super.deleteCustomerById(id);
    }

    @Override
    public ResponseEntity<Address> getAddressesByCustomerId(String id) {
        // TODO Auto-generated method stub
        return CustomerApi.super.getAddressesByCustomerId(id);
    }

    @Override
    public ResponseEntity<List<User>> getAllCustomers() {
        // TODO Auto-generated method stub
        return CustomerApi.super.getAllCustomers();
    }

    @Override
    public ResponseEntity<Card> getCardsByCustomerId(String id) {
        // TODO Auto-generated method stub
        return CustomerApi.super.getCardsByCustomerId(id);
    }

    @Override
    public ResponseEntity<User> getCustomerById(String id) {
        // TODO Auto-generated method stub
        return CustomerApi.super.getCustomerById(id);
    }
    
}
