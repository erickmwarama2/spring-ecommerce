package com.erick.mutwiri.api.repository;

import java.util.Optional;

import com.erick.mutwiri.api.entity.OrderEntity;
import com.erick.mutwiri.api.model.NewOrder;

public interface OrderRepositoryExt {
    Optional<OrderEntity> insert(NewOrder m);
}
