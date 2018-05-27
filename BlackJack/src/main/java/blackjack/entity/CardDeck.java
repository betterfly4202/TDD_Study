package blackjack.entity;

import java.util.*;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class CardDeck extends Card{
    private Stack<Card> cardDeck = new Stack<>();
//    private HashSet<Card> cardSet;
    private List<Card> cardSet;

//    private void mixedCardDeck(){
//        cardSet = new HashSet<>();
//
//        for(CardShapeEntity shapeEntity : CardShapeEntity.values()) {
//            this.cardShape = shapeEntity;
//
//            for (CardNumberEntity numberEntity : CardNumberEntity.values()) {
//                cardSet.add(new Card(this.cardShape, numberEntity));
//            }
//        }
//    }

    public CardDeck(){
        this.setCardDeckList();
    }

    private List<Card> mixedCardDeck(){
//        cardSet = new HashSet<>();
        cardSet = new ArrayList<>();

        for(CardShapeEntity shapeEntity : CardShapeEntity.values()) {
            this.cardShape = shapeEntity;

            for (CardNumberEntity numberEntity : CardNumberEntity.values()) {
                cardSet.add(new Card(this.cardShape, numberEntity));
            }
        }

        Collections.shuffle(cardSet);
        return cardSet;
    }

    public void setCardDeckList(){
        mixedCardDeck();

        for (Iterator<Card> it = cardSet.iterator(); it.hasNext();) {
            cardDeck.push(it.next());
        }
    }


    public Stack<Card> getCardDeckList(){
        return this.cardDeck;
    }

    public Card getCardEntity(){
        return cardDeck.pop();
    }

}
