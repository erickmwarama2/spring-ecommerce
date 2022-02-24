package com.erick.mutwiri.api.service;

import java.util.List;

import com.erick.mutwiri.api.entity.ItemEntity;
import com.erick.mutwiri.api.model.Item;

public interface ItemService {
    
    ItemEntity toEntity(Item m);

    List<ItemEntity> toEntityList(List<Item> items);

    Item toModel(ItemEntity e);

    List<Item> toModelList(List<ItemEntity> items);
}
