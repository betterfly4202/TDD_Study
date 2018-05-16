package blackjack.domain;

import blackjack.entity.CardNumberEntity;

import javax.smartcardio.Card;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public interface BlackJackService {
    boolean isAce(CardNumberEntity cardNumber);

    boolean isBlackJack(Card card);

    boolean isHit(Card card);

    boolean isStand(Card card);

    boolean isBust(Card card);

    Card compareWithCard(Card card);

}