package com.blackjack.entity;

/**
 * Created by betterFLY on 2018. 5. 11.
 * Github : http://github.com/betterfly88
 */

public enum CardNumberEntity {
    ACE(1)
//    {public int isAce(boolean selected) {
//            return selected == true ? 11 : 1;
//        }}
    ,
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    final private int cardNumber;

    CardNumberEntity(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }


}