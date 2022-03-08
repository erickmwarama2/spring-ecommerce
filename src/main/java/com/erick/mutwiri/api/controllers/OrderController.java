package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.OrderApi;
import com.erick.mutwiri.api.model.NewOrder;
import com.erick.mutwiri.api.model.Order;

import org.springframework.http.ResponseEntity;

public class OrderController implements OrderApi {

    @Override
    public ResponseEntity<List<Order>> addOrder(@Valid NewOrder newOrder) {
        // TODO Auto-generated method stub
        return OrderApi.super.addOrder(newOrder);
    }

    @Override
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@NotNull @Valid String customerId) {
        // TODO Auto-generated method stub
        return OrderApi.super.getOrdersByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<Order> getOrdersByOrderId(String id) {
        // TODO Auto-generated method stub
        return OrderApi.super.getOrdersByOrderId(id);
    }
    
}
