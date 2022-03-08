package com.erick.mutwiri.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.erick.mutwiri.api.CardApi;
import com.erick.mutwiri.api.model.AddCardReq;
import com.erick.mutwiri.api.model.Address;
import com.erick.mutwiri.api.model.Card;

import org.springframework.http.ResponseEntity;

public class CardController implements CardApi {

    @Override
    public ResponseEntity<Void> deleteCardById(String id) {
        // TODO Auto-generated method stub
        return CardApi.super.deleteCardById(id);
    }

    @Override
    public ResponseEntity<List<Card>> getAllCards() {
        // TODO Auto-generated method stub
        return CardApi.super.getAllCards();
    }

    @Override
    public ResponseEntity<Card> getCardById(String id) {
        // TODO Auto-generated method stub
        return CardApi.super.getCardById(id);
    }

    @Override
    public ResponseEntity<Address> registerCard(@Valid AddCardReq addCardReq) {
        // TODO Auto-generated method stub
        return CardApi.super.registerCard(addCardReq);
    }
    
}
