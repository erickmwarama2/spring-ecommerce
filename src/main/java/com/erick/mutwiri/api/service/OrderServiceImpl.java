package com.erick.mutwiri.api.service;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.entity.OrderEntity;
import com.erick.mutwiri.api.exceptions.ResourceNotFoundException;
import com.erick.mutwiri.api.model.NewOrder;
import com.erick.mutwiri.api.repository.OrderRepository;
// import com.erick.mutwiri.api.repository.UserRepository;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    
    private OrderRepository repository;
    // private UserRepository userRepo;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<OrderEntity> addOrder(@Valid NewOrder newOrder) {
        if(Strings.isEmpty(newOrder.getCustomer().toString())){
            throw new ResourceNotFoundException("Invalid customer id.");
        }

        if(Objects.isNull(newOrder.getAddress()) || Strings.isEmpty(newOrder.getAddress().toString())) {
            throw new ResourceNotFoundException("Invalid card id.");
        }

        return repository.insert(newOrder);
    }

    @Override
    public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId) {
        return repository.findByCustomerId(UUID.fromString(customerId));
    }

    @Override
    public Optional<OrderEntity> getByOrderId(String id) {
        return repository.findById(UUID.fromString(id));
    }
    
}
