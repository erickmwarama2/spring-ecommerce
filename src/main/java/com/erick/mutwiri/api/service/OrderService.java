package com.erick.mutwiri.api.service;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.entity.OrderEntity;
import com.erick.mutwiri.api.model.NewOrder;

public interface OrderService {
    public Optional<OrderEntity> addOrder(@Valid NewOrder newOrder);
    public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull String customerId);
    public Optional<OrderEntity> getByOrderId(String id);
}
