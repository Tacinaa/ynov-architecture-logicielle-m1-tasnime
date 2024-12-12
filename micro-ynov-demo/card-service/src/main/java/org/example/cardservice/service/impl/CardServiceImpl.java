package org.example.cardservice.service.impl;

import org.example.cardservice.entity.Card;
import org.example.cardservice.repository.CardRepository;
import org.example.cardservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private AccountClient accountClient;

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElseThrow(() -> new RuntimeException("Card pas trouvée"));
    }

    @Override
    public List<Card> getCardsByAccountId(Long accountId) {
        return cardRepository.findByAccountId(accountId);
    }

    @Override
    public Card saveCard(Card card) {
        if (!accountClient.doesAccountExist(card.getAccountId())) {
            throw new IllegalArgumentException("Le compte n'existe pas");
        }
        return cardRepository.save(card);
    }

    @Override
    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}