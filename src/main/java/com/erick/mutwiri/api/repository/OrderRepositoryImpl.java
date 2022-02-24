package com.erick.mutwiri.api.repository;

import java.util.Optional;

import javax.persistence.EntityManager;

import com.erick.mutwiri.api.entity.OrderEntity;
import com.erick.mutwiri.api.model.NewOrder;

public class OrderRepositoryImpl implements OrderRepositoryExt {

    private EntityManager em;
    private ItemRepository itemRepo;
    //private ItemService itemService;

    public OrderRepositoryImpl() {

    }

    @Override
    public Optional<OrderEntity> insert(NewOrder m) {
        return null;
    }
    
}
