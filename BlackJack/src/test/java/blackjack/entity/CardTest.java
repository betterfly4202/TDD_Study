package blackjack.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 5. 9.
 * Github : http://github.com/betterfly88
 */


public class CardTest {
    String type;
    int num;

    Card card;

    @Before
    public void setUp(){
        card = new Card();
    }

    @Test
    public void getCardList(){
        CardShapeEntity a = CardShapeEntity.CLUB;
        System.out.println(a.getShape());
//        String a = new CardShapeEntity.CardShape("SPADE").getShape();
    }

    @Test
    public void getCardNum(){
        System.out.println(card.getCardNum());
        Assert.assertEquals(card.getCardNum() > 4, card.getCardNum()); // 단일 메서드로 종료
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }
}