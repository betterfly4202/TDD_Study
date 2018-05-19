package blackjack.domain;

import blackjack.entity.Card;
import blackjack.entity.CardDeck;
import blackjack.entity.CardNumberEntity;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class BlackJackServiceImpl implements BlackJackService {

    @Override
    public Card openCard(CardDeck cardDeck) {
        return cardDeck.getCardEntity();
    }

    @Override
    public boolean isAce(CardNumberEntity cardNumber){
        if(cardNumber.equals(CardNumberEntity.ACE)){

            return true;
        }

        return false;
    }

    @Override
    public boolean isBlackJack(int sumCardPoint) {
        if(sumCardPoint == 21){
            return true;
        }
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

    @Override
    public int sumCardPoint(List<Card> cardList) {
//        int totalPoint = 0;
//        for(Card card : cardList){
//            totalPoint += card.cardNum.getCardNumber();
//        }
        int totalPoint = cardList.stream()
                .map(card -> card.cardNum.getCardNumber())
                .mapToInt(Integer::intValue)
                .sum();

        return totalPoint;
    }
}
