package com.erick.mutwiri.api.service;

import java.util.Optional;
import java.util.UUID;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.entity.ProductEntity;
import com.erick.mutwiri.api.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<ProductEntity> getProduct(@Min(value = 1, message = "Invalid product Id") String id) {
        return repository.findById(UUID.fromString(id));
    }

    @Override
    public @NotNull Iterable<ProductEntity> getAllProducts() {
        return repository.findAll();
    }
    
}
