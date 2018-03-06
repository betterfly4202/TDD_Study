package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceimpl implements CarService{

    CarInfo carInfo;

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

    @Override
    public int recursiveCar(int cars){
        System.out.println(cars);
        if(cars < 1)
            return cars;

        return recursiveCar(cars-1);
    }

    static Map<Integer, Boolean> map = new HashMap();

    @Override
    public int recursiveTimes(int times){
        if(times < 1)
            return times;

        CarServiceimpl carServiceimpl = new CarServiceimpl();
        map.put(times, carServiceimpl.checkMovingState(carServiceimpl.extractMoveNumber(0,9)));

        return recursiveTimes(times-1);
    }

    public static void main(String [] args){
        CarServiceimpl impl = new CarServiceimpl();
        impl.recursiveTimes(5);

        System.out.println(map);
    }
}
