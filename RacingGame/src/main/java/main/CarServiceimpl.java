package main;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceimpl implements CarService{
    @Override
    public int extractMoveNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    @Override
    public boolean checkMovingState(int num) {
        boolean flag = false;

        if(num > 4)
            flag=true;

        return flag;
    }
}
