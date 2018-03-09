package service;

import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public interface CarService {
    MOVING_TYPE checkMovingState(int num);

    int recursiveCar(int cars, int times);
    int recursiveTimes(int times, HashMap<Integer, MOVING_TYPE> map);

    int recursiveTimesWithList(int times, ArrayList<String> moveStateList);

}
