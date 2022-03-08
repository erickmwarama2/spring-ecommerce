package com.erick.mutwiri.api.service;

import java.util.Optional;

import javax.validation.Valid;

import com.erick.mutwiri.api.entity.CardEntity;
// import com.erick.mutwiri.api.model.Card;
import com.erick.mutwiri.api.model.AddCardReq;

public interface CardService {
    public void deleteCardById(String id);
    public Iterable<CardEntity> getAllCards();
    public Optional<CardEntity> getCardById(String id);
    public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
