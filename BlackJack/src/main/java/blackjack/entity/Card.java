package blackjack.entity;

/**
 * Created by betterFLY on 2018. 4. 27.
 * Github : http://github.com/betterfly88
 */


class Card{
    public CardShapeEntity cardShape;
    public CardNumberEntity cardNum;

    public Card(){

    }

    public Card(CardShapeEntity cardShape, CardNumberEntity cardNum){
        this.cardShape = cardShape;
        this.cardNum = cardNum;

    }
}