package com.erick.mutwiri.api.controllers;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import com.erick.mutwiri.api.CartApi;
import com.erick.mutwiri.api.model.Cart;
import com.erick.mutwiri.api.model.Item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController implements CartApi {
    private static final Logger LOG = LoggerFactory.getLogger(CartController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
        LOG.info("Request for customer ID: {}\nItem: {}", item);
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }

    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, @Valid Item item) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCart(String customerId) {
        // TODO Auto-generated method stub
        //return CartApi.super.deleteCart(customerId);
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
        // TODO Auto-generated method stub
        //return CartApi.super.deleteItemFromCart(customerId, itemId);
        return null;
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        // TODO Auto-generated method stub
        //return CartApi.super.getCartByCustomerId(customerId);
        LOG.info("Request has been received");
        throw new RuntimeException("Manual exception thrown");
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
        // TODO Auto-generated method stub
        // return CartApi.super.getCartItemsByCustomerId(customerId);

        return null;
    }

    
}
