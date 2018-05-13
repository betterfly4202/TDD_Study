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


/*
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");
 */

public class CardTest {
    String type;
    int num;

    Card card;

    @Before
    public void setUp(){
        card = new Card(CardShapeEntity.HEART, CardNumberEntity.TWO);
    }

    @Test
    public void getCardNum(){
//        Card heartCard = new Card(CardShapeEntity.HEART, CardNumberEntity.TWO);
        card.setCardDeckList(new Card(CardShapeEntity.DIAMOND, CardNumberEntity.THREE));
        card.setCardDeckList(new Card(CardShapeEntity.DIAMOND, CardNumberEntity.THREE));
        card.setCardDeckList(new Card(CardShapeEntity.DIAMOND, CardNumberEntity.THREE));

        for(Card tempCard : card.getCardDeckList()){
            System.out.println(tempCard);
        }
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }

    @Test
    public void 카드_리스트추출하기(){

    }

    @Test
    public void 카드_(){

    }
}