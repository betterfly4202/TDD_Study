package service;

import common.Utils;
import dto.MOVING_TYPE;

import java.util.*;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceimpl implements CarService{
    List<HashMap<Integer, MOVING_TYPE>> carList = new ArrayList<>();

    @Override
    public MOVING_TYPE checkMovingState(int num) {
        if(num > 4)
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }

    @Override
    public int recursiveCar(int cars, int times){
        if(cars < 1)
            return cars;

        HashMap<Integer, MOVING_TYPE> map = new HashMap();
        recursiveTimes(times, map);
        carList.add(map);

        return recursiveCar(cars-1, times);
    }

    @Override
    public int recursiveTimes(int times, HashMap<Integer, MOVING_TYPE> map){
        if(times < 1)
            return times;

        map.put(times, checkMovingState(Utils.extractMoveNumber(0, 9)));
        return recursiveTimes(times-1, map);
    }

    public void outputList(int cars, int times){
        recursiveCar(cars, times);
        System.out.println(carList);
        for(int i=1; i<=times; i++){
            for(int j=0; j<cars; j++){
                System.out.println(carList.get(j).get(i));
            }
            System.out.println();
        }
    }
}


/**
 1.
 map으로 받는걸 CarInfo 객체로 맵핑하고
 Car 라는 리스트에다가 <CarInfo> 이런식으로 넣으면
 자동차 3개, 시도 5번 인 경우
 0 -> map<CarInfo>
 1 -> map<CarInfo>
 2 -> map<CarInfo>
 이런식으로 출력하면됨

 2.
 enum활용
 true -> "-"
 false -> ""
 맵핑하기
 */