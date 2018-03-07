package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarInfo {
    int cars;
    int times;
    List<HashMap<Integer, CarServiceimpl.MOVING_TYPE>> carList;

    public CarInfo(int cars, int times){
        this.cars = cars;
        this.times = times;
    }

}