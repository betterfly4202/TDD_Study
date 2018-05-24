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
    public Card isHit(CardDeck cardDeck) {
        return cardDeck.getCardEntity();
    }

    @Override
    public void isStand(List<Card> cardList) {
        sumCardPoint(cardList);
    }

    @Override
    public boolean isBust(int sumPoint) {
        if(sumPoint > 21){
            return true;
        }

        return false;
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
