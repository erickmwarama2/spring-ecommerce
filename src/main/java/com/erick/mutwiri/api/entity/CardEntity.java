package com.erick.mutwiri.api.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "card")
@Data
public class CardEntity {
    
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "EXPIRES")
    private String expires;

    @Column(name = "CVV")
    private String cvv;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private UserEntity user;

    @OneToMany(mappedBy = "cardEntity", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OrderEntity> orders;
}
