package com.erick.mutwiri.api.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "order_item")
@Data
public class OrderItemEntity {
    
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "item_id")
    private UUID itemId;
}
