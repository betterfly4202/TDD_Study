package common;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */

public class Utils {
    public static int extractMoveNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
