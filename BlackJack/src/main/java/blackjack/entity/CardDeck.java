package blackjack.entity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class CardDeck extends Card{
    private Stack<Card> cardDeck = new Stack<>();
    private HashSet<Card> cardSet;

    private void mixedCardDeck(){
        cardSet = new HashSet<>();

        for(CardShapeEntity shapeEntity : CardShapeEntity.values()) {
            this.cardShape = shapeEntity;

            for (CardNumberEntity numberEntity : CardNumberEntity.values()) {
                cardSet.add(new Card(this.cardShape, numberEntity));
            }
        }
    }

    private void clearCardDeck(){
        cardSet.clear();
    }

    public void setCardDeckList(){
        //FIXME set으로 해서 Stack으로 담았는데 출력하니까 결가가 2개씩 겹치는게 심상치 않다..
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
