package com.erick.mutwiri.api.entity;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import lombok.Data;

@Entity
@Table(name = "cart")
//@Data
public class CartEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private UserEntity user;

    @ManyToMany(
        cascade = CascadeType.ALL
    )
    @JoinTable(
        name = "CART_ITEM",
        joinColumns = @JoinColumn(name = "CART_ID"),
        inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<ItemEntity> items = Collections.emptyList();

    public List<ItemEntity> getItems() {
        return items;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }
}
