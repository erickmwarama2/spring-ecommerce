package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.erick.mutwiri.api.ShippingApi;
import com.erick.mutwiri.api.model.Authorization;
import com.erick.mutwiri.api.model.Shipment;
import com.erick.mutwiri.api.model.ShippingReq;

import org.springframework.http.ResponseEntity;

public class ShipmentController implements ShippingApi {

    @Override
    public ResponseEntity<List<Shipment>> getShipmentByOrderId(@NotNull @Valid String id) {
        // TODO Auto-generated method stub
        return ShippingApi.super.getShipmentByOrderId(id);
    }

    @Override
    public ResponseEntity<Authorization> shipOrder(@Valid ShippingReq shippingReq) {
        // TODO Auto-generated method stub
        return ShippingApi.super.shipOrder(shippingReq);
    }
    
}
