package com.erick.mutwiri.api.service;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.entity.AuthorizationEntity;
import com.erick.mutwiri.api.model.PaymentReq;

public interface PaymentService {
    
    public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
    public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
