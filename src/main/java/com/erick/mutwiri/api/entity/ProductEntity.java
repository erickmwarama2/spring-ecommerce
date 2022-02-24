package com.erick.mutwiri.api.entity;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.model.Product;

@Entity
@Table(name = "product")
public class ProductEntity {
    
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @NotNull(message = "Product name is required")
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "COUNT")
    private int count;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "PRODUCT_TAG",
        joinColumns = @JoinColumn(name = "PRODUCT_ID"),
        inverseJoinColumns = @JoinColumn(name = "TAG_ID")
    )
    private List<TagEntity> tags = Collections.emptyList();

    @OneToMany(mappedBy = "product")
    private List<ItemEntity> items;

    public ProductEntity(){

    }

    public int getQuantity() {
        return quantity;
    }

    public ProductEntity setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductEntity(UUID id, @NotNull(message = "product name is required") String name, String description, BigDecimal price, int count, String imageUrl) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
        this.setCount(count);
        this.setImageUrl(imageUrl);
    }

    public UUID getId() {
        return id;
    }

    public ProductEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }
}
