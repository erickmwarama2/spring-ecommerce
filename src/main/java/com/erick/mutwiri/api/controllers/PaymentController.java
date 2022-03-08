package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.PaymentApi;
import com.erick.mutwiri.api.model.Authorization;
import com.erick.mutwiri.api.model.PaymentReq;

import org.springframework.http.ResponseEntity;

public class PaymentController implements PaymentApi {

    @Override
    public ResponseEntity<Authorization> authorize(@Valid PaymentReq paymentReq) {
        // TODO Auto-generated method stub
        return PaymentApi.super.authorize(paymentReq);
    }

    @Override
    public ResponseEntity<List<Authorization>> getOrdersPaymentAuthorization(@NotNull @Valid String id) {
        // TODO Auto-generated method stub
        return PaymentApi.super.getOrdersPaymentAuthorization(id);
    }
    
}
