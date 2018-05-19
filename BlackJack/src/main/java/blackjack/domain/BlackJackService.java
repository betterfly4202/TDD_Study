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
    Card openCard(CardDeck cardDeck);

    boolean isAce(CardNumberEntity cardNumber);

    boolean isBlackJack(int sumCardPoint);

    boolean isHit(Card card);

    boolean isStand(Card card);

    boolean isBust(Card card);

    Card compareWithCard(Card card);

    int sumCardPoint(List<Card> cardList);

}