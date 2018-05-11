package entity;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 9.
 * Github : http://github.com/betterfly88
 */


public class CardTest {
    String type;
    int num;


    public void getCardList(){

    }

    @Test
    public List<Integer> getCardNum(){
        List<Integer> cardNumList = new LinkedList<>();
        for(int cardNum=1; cardNum<12; cardNum++){
            cardNumList.add(cardNum);
        }

        return cardNumList;
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }

}
