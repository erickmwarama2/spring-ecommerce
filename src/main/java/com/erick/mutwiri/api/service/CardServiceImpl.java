package com.erick.mutwiri.api.service;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import com.erick.mutwiri.api.entity.CardEntity;
import com.erick.mutwiri.api.entity.UserEntity;
import com.erick.mutwiri.api.model.AddCardReq;
// import com.erick.mutwiri.api.model.Card;
import com.erick.mutwiri.api.repository.CardRepository;
import com.erick.mutwiri.api.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    private CardRepository repository;
    private UserRepository userRepo;

    public CardServiceImpl(CardRepository repository, UserRepository userRepo) {
        this.repository = repository;
        this.userRepo = userRepo;
    }

    @Override
    public void deleteCardById(String id) {
        repository.deleteById(UUID.fromString(id));        
    }

    @Override
    public Iterable<CardEntity> getAllCards() {
        return repository.findAll();
    }

    @Override
    public Optional<CardEntity> getCardById(String id) {
        return repository.findById(UUID.fromString(id));
    }

    @Override
    public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq) {
        return Optional.of(repository.save(toEntity(addCardReq)));
    }

    private CardEntity toEntity(AddCardReq m) {
        CardEntity e = new CardEntity();
        Optional<UserEntity> user = userRepo.findById(UUID.fromString(m.getUserId().toString()));
        user.ifPresent(u -> e.setUser(u));
        return e.setNumber(m.getCardNumber()).setCvv(m.getCcv()).setExpires(m.getExpires());
    }
    
}
