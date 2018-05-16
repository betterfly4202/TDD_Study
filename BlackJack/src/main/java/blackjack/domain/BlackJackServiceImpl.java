package blackjack.domain;

import blackjack.entity.CardNumberEntity;

import javax.smartcardio.Card;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class BlackJackServiceImpl implements BlackJackService {
    @Override
    public boolean isAce(CardNumberEntity cardNumber){
        if(cardNumber.equals(CardNumberEntity.ACE)){
            return true;
        }

        return false;
    }

    @Override
    public boolean isBlackJack(Card card) {
        return false;
    }

    @Override
    public boolean isHit(Card card) {
        return false;
    }

    @Override
    public boolean isStand(Card card) {
        return false;
    }

    @Override
    public boolean isBust(Card card) {
        return false;
    }

    @Override
    public Card compareWithCard(Card card) {
        return null;
    }

}
