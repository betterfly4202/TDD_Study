package blackjack.entity;

import java.util.Stack;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class CardDeck{
    private CardShapeEntity cardShape;

    private static Stack<Card> cardDeck = new Stack<>();

    public void setCardDeckList(){
        for(CardNumberEntity numberEntity : CardNumberEntity.values()){
            cardDeck.push(new Card(this.cardShape, numberEntity));
        }
    }

    public Stack<Card> getCardDeckList(){
        return this.cardDeck;
    }

    public CardNumberEntity getCardNum(){
        return cardDeck.pop().cardNum;
    }
}
