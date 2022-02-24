package com.erick.mutwiri.api.service;

import java.util.Optional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.entity.ProductEntity;

public interface ProductService {
    
    Optional<ProductEntity> getProduct(@Min(
        value = 1L, message = "Invalid product Id"
    ) String id);

    @NotNull Iterable<ProductEntity> getAllProducts();
}
