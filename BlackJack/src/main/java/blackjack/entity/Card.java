package blackjack.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by betterFLY on 2018. 4. 27.
 * Github : http://github.com/betterfly88
 */


public class Card {

    public Object getCardNum(){
        List<Object> cardNumList = new LinkedList<>();
        for(int cardNum=1; cardNum<11; cardNum++){
            cardNumList.add(cardNum);
        }
        cardNumList.add("J");
        cardNumList.add("Q");
        cardNumList.add("K");
        cardNumList.add("Ace");

        return cardNumList.get(getRandomNum());
    }

    private int getRandomNum(){
        Random getRandomNum = new Random();
        return getRandomNum.nextInt(14);
    }

    public int parsingCardObjectToInteger(Object cardNum){
        if(cardNum.equals("J") || cardNum.equals("Q") || cardNum.equals("K")){
            return 10;
        }else if (cardNum.equals("Ace")){
            return isAce();
        }

        return (int)cardNum;
    }

    public int isAce(){

    }

}