package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.erick.mutwiri.api.ProductApi;
import com.erick.mutwiri.api.model.Product;

import org.springframework.http.ResponseEntity;

public class ProductController implements ProductApi {

    @Override
    public ResponseEntity<Product> getProduct(String id) {
        // TODO Auto-generated method stub
        return ProductApi.super.getProduct(id);
    }

    @Override
    public ResponseEntity<List<Product>> queryProducts(@Valid String tag, @Valid String name, @Valid Integer page,
            @Valid Integer size) {
        // TODO Auto-generated method stub
        return ProductApi.super.queryProducts(tag, name, page, size);
    }
    
}
