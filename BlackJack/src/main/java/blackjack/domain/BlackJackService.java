package blackjack.domain;

import blackjack.entity.CardDeck;
import blackjack.entity.CardNumberEntity;

import blackjack.entity.Card;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public interface BlackJackService {
    boolean isAce(CardNumberEntity cardNumber);

    boolean isBlackJack(int sumCardPoint);

    Card isHit(CardDeck cardDeck);

    void isStand(List<Card> cardList);

    boolean isBust(int sumPoint);

    int sumCardPoint(List<Card> cardList);

}