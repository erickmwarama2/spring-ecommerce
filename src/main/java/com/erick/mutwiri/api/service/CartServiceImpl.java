package com.erick.mutwiri.api.service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.erick.mutwiri.api.entity.CartEntity;
import com.erick.mutwiri.api.entity.ItemEntity;
import com.erick.mutwiri.api.exceptions.CustomerNotFoundException;
import com.erick.mutwiri.api.exceptions.GenericAlreadyExistsException;
import com.erick.mutwiri.api.exceptions.ItemNotFoundException;
// import com.erick.mutwiri.api.model.Cart;
import com.erick.mutwiri.api.model.Item;
import com.erick.mutwiri.api.repository.CartRepository;
import com.erick.mutwiri.api.repository.UserRepository;

import org.springframework.stereotype.Service;

// import static org.springframework.objenesis.instantiator.util.UnsafeUtils.getUnsafe;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository repository;
    private UserRepository userRepo;
    private ItemService itemService;

    public CartServiceImpl(CartRepository repository, UserRepository userRepo, ItemService itemService) {
        this.repository = repository;
        this.userRepo = userRepo;
        this.itemService = itemService;
    }

    @Override
    public List<Item> addCartItemsByCustomerId(String customerId, @Valid Item item) {
        CartEntity entity = getCartByCustomerId(customerId);
        long count = entity.getItems().stream().filter(i -> i.getProduct().getId().equals(UUID.fromString(item.getId()))).count();
        
        if(count > 0) {
            throw new GenericAlreadyExistsException(
                String.format("Item with Id (%s) already exists. You can update it.", item.getId())
            );
        }

        entity.getItems().add(itemService.toEntity(item));
        return itemService.toModelList(repository.save(entity).getItems());
    }

    @Override
    public List<Item> addOrReplaceItemsByCustomerId(String customerId, @Valid Item item) {
        CartEntity entity = getCartByCustomerId(customerId);
        List<ItemEntity> items = Objects.nonNull(entity.getItems()) ? entity.getItems() : Collections.emptyList();

        AtomicBoolean itemExists = new AtomicBoolean(false);

        items.forEach(i -> {
            if(i.getProduct().getId().equals(UUID.fromString(item.getId()))){
                i.setQuantity(item.getQuantity()).setPrice(i.getPrice());
                itemExists.set(true);
            }
        });

        if(!itemExists.get()){
            items.add(itemService.toEntity(item));
        }
        return itemService.toModelList(repository.save(entity).getItems());
    }

    @Override
    public void deleteCart(String customerId) {
        CartEntity entity = getCartByCustomerId(customerId);
        repository.deleteById(entity.getId());        
    }

    @Override
    public void deleteItemFromCart(String customerId, String itemId) {
        CartEntity entity = getCartByCustomerId(customerId);
        List<ItemEntity> updatedItems = entity.getItems().stream()
        .filter(i -> !i.getProduct().getId().equals(UUID.fromString(itemId))).collect(Collectors.toList());     
        
        entity.setItems(updatedItems);
        repository.save(entity);
    }

    @Override
    public CartEntity getCartByCustomerId(String customerId) {
        CartEntity entity = repository.findByCustomerId(UUID.fromString(customerId))
        .orElse(new CartEntity());

        if(Objects.isNull(entity.getUser())){
            entity.setUser(userRepo.findById(UUID.fromString(customerId)).orElseThrow(() -> new CustomerNotFoundException(String.format(" - %s", customerId))));
        }

        return entity;
    }

    @Override
    public List<Item> getCartItemsByCustomerId(String customerId) {
        CartEntity entity = getCartByCustomerId(customerId);
        return itemService.toModelList(entity.getItems());
    }

    @Override
    public Item getCartItemsByItemId(String customerId, String itemId) {
        CartEntity entity = getCartByCustomerId(customerId);
        AtomicReference<ItemEntity> itemEntity = new AtomicReference<>();
        entity.getItems().forEach(i -> {
            if(i.getProduct().getId().equals(UUID.fromString(itemId))){
                itemEntity.set(i);
            }
        });

        if(Objects.isNull(itemEntity.get())) {
            throw new ItemNotFoundException(String.format(" - %s", itemId));
        }

        return itemService.toModel(itemEntity.get());
    }
    
}
