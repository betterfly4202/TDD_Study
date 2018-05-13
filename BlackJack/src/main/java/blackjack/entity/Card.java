package blackjack.entity;

import blackjack.common.Utils;

import java.util.*;

/**
 * Created by betterFLY on 2018. 4. 27.
 * Github : http://github.com/betterfly88
 */


public class Card {
    private CardShapeEntity cardShape;
    private CardNumberEntity cardNum;
    private static Stack<Card> cardDeck;

    public Card(CardShapeEntity cardShape, CardNumberEntity cardNum){
        this.cardShape = cardShape;
        this.cardNum = cardNum;
    }

    public Map<CardShapeEntity, Object> setCardList(){
        Map<CardShapeEntity, Object> cardNumObj = new LinkedHashMap<>();
        for(int i=1; i<11; i++){
            cardNumObj.put(CardShapeEntity.DIAMOND, i);
        }

        return cardNumObj;
    }

    public Stack<Card> setCardDeckList(Card card){
        cardDeck = new Stack<>();
        cardDeck.push(card);

        return cardDeck;
    }

    public Stack<Card> getCardDeckList(){
        return this.cardDeck;
    }

    // Stack 으로 구현하기 >> pop()
    public Object getCardNum(){
        List<Object> cardNumList = new LinkedList<>();
        for(int cardNum=1; cardNum<11; cardNum++){
            cardNumList.add(cardNum);
        }
        cardNumList.add("J");
        cardNumList.add("Q");
        cardNumList.add("K");
        cardNumList.add("Ace");

        return cardNumList.get(Utils.getRandomNum());
    }

    public int parsingCardObjectToInteger(Object cardNum){
        if(cardNum.equals("J") || cardNum.equals("Q") || cardNum.equals("K")){
            return 10;
        }else if (cardNum.equals("Ace")){
//            return isAce();
        }

        return (int)cardNum;
    }

    public int isAce(String selectAce){
        int aceNum = selectAce == "" ? 1 : 10;

        return aceNum;
    }
}