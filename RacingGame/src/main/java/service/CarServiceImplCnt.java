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

    public int recursiveTimes(int times, List <String> moveStateList){
        if(times < 1)
            return times;

        moveStateList.add(additionalMovement(checkMoveCount(Utils.extractMoveNumber())));

        return recursiveTimes(times-1, moveStateList);
    }

    /**
     * @return
     *
     * 무조건 MOVING_TYPE 을 더한 문자열을 다음 리스트에 add 시켜줘야함
     * parsingMovingState 라는 메서드 이름 변경해서 여기서
     * 무빙정보 리스트에 무조건 리스트 앞에 + 전달받은거 ++ 해주면됨
     * 인자값을 MOVINGT_TYPE 으로 받고, list.size()-1 + MOVING_TYPE 의 문자열을 리턴
     */

    public String additionalMovement(MOVING_TYPE type){
        if(moveStateList.size() < 1){
            return type.getType();
        }
        return moveStateList.get(moveStateList.size()-1)+type.getType();
    }

    public void test(int cars, int times){
        recursiveRacingGame(cars,times);
        System.out.println(racingCarList);
    }

    public int recursiveRacingGame(int cars, int times){
        if(cars < 1)
            return cars;

        moveStateList  = new ArrayList<>();
        recursiveTimes(times, moveStateList);
        racingCarList.put(cars, moveStateList);

        return recursiveRacingGame(cars-1, times);
    }
}
