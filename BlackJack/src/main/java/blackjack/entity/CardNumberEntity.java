package blackjack.entity;

import java.util.Arrays;

/**
 * Created by betterFLY on 2018. 5. 11.
 * Github : http://github.com/betterfly88
 */

public enum CardNumberEntity {
    ACE("ACE"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    final private String number;

    CardNumberEntity(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }



}