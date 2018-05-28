package com.blackjack.domain;


import com.blackjack.entity.Card;
import com.blackjack.entity.CardDeck;
import com.blackjack.entity.CardNumberEntity;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public interface BlackJackService {
    boolean isAce(CardNumberEntity cardNumber);

    boolean isBlackJack(int sumCardPoint);

    com.blackjack.entity.Card isHit(CardDeck cardDeck);

    void isStand(List<Card> cardList);

    boolean isBust(int sumPoint);

    int sumCardPoint(List<Card> cardList);

}