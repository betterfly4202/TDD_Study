package blackjack.entity;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 5. 9.
 * Github : http://github.com/betterfly88
 */

public class CardTest {
    CardDeck card;

    @Before
    public void setUp(){
        card = new CardDeck();
        card.setCardDeckList();
    }

    @Test
    public void getCardNum(){
//        Card heartCard = new Card(CardShapeEntity.HEART, CardNumberEntity.TWO);
        System.out.println(card.getCardDeckList());
        for(Card tempCard : card.getCardDeckList()){
            System.out.println(tempCard);
        }
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }

    @Test
    public void 카드덱_생성() {
        Assertions.assertThat(card.getCardDeckList().size()).isEqualTo(52);

        Card firstCard = card.getCardEntity();
        System.out.println(firstCard.cardNum);
        System.out.println(firstCard.cardShape);
    }

}