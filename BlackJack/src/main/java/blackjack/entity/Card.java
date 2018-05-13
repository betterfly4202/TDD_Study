package blackjack.entity;

import blackjack.common.Utils;

import java.util.*;

/**
 * Created by betterFLY on 2018. 4. 27.
 * Github : http://github.com/betterfly88
 */


class Card{
    public CardShapeEntity cardShape;
    public CardNumberEntity cardNum;
    private static Stack<Card> cardDeck = new Stack<>();

    public Card(CardShapeEntity cardShape){
        this.cardShape = cardShape;
    }

    public Card(CardShapeEntity cardShape, CardNumberEntity cardNum){
        this.cardShape = cardShape;
        this.cardNum = cardNum;

    }

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

abstract class CardBuilder{
    public abstract void buildCardDeck();
}

class SpadeCard extends Card{
    public SpadeCard(CardShapeEntity cardShape) {
        super(cardShape);
    }

    @Override
    public void setCardDeckList() {
        super.setCardDeckList();
    }
}