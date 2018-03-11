package service;

import common.Utils;
import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 10.
 * Github : http://github.com/betterfly88
 */

public class CarServiceImplCnt{
    Map<Integer, List<String>> racingCarList = new HashMap<>();
    List <String> moveStateList;

    public MOVING_TYPE checkMoveCount(int randNum){
        if(randNum > 4 )
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }

    public String additionalMovement(MOVING_TYPE type){
        if(moveStateList.size() < 1){
            return type.getType();
        }
        return moveStateList.get(moveStateList.size()-1)+type.getType();
    }

    public int recursiveTimes(int times, List <String> moveStateList){
        if(times < 1)
            return times;

        moveStateList.add(additionalMovement(checkMoveCount(Utils.extractMoveNumber())));

        return recursiveTimes(times-1, moveStateList);
    }


    public int recursiveRacingGame(int cars, int times){
        if(cars < 1)
            return cars;

        moveStateList  = new ArrayList<>();
        recursiveTimes(times, moveStateList);
        racingCarList.put(cars, moveStateList);

        return recursiveRacingGame(cars-1, times);
    }

    public void test(int cars, int times){
        recursiveRacingGame(cars,times);
        System.out.println(racingCarList);
    }


}
