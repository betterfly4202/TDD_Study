package com.blackjack.common;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class Utils {

    public static int getRandomNum(){
        Random getRandomNum = new Random();
        return getRandomNum.nextInt(14);
    }
}
