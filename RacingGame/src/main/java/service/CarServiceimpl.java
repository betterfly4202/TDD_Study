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

    List <ArrayList<MOVING_TYPE>> carMoveList = new ArrayList<>();

    @Override
    public MOVING_TYPE checkMovingState(int num) {
        if(num > 4)
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }



    static int moveCnt = 0;

    public int checkMoveCount(int randNum){
        if(randNum > 4 )
            return moveCnt++;

        return moveCnt;
    }

    public boolean invokeMoveCount(String type) {
        return type.equals(MOVING_TYPE.MOVE);
    }

    /*
        차량 토탈 이동 정보
     */
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

        map.put(times, checkMovingState(Utils.extractMoveNumber()));
        return recursiveTimes(times-1, map);
    }

    /*
        차량별 이동 정보
     */
    @Override
    public int recursiveTimesWithList(int times, ArrayList<String> moveStateList) {
        if(times < 1)
            return times;

//        moveStateList.add(checkMovingState(Utils.extractMoveNumber(0, 9)));
//        moveStateList.add(checkPreviousMovingState(checkMovingState(Utils.extractMoveNumber(0, 9))));
        return recursiveTimesWithList(times-1, moveStateList);
    }

    public String checkPreviousMovingState(ArrayList<MOVING_TYPE> moveStateList){
        if(moveStateList.size()-1 < 1)
            return "";

        if(moveStateList.get(moveStateList.size()-1).equals(MOVING_TYPE.MOVE)){
            return moveStateList.get(moveStateList.size()-1).getType()+MOVING_TYPE.MOVE.getType();
        }

        return moveStateList.get(moveStateList.size()-1).getType();
    }

    public void outputList(int cars, int times){
        recursiveCar(cars, times);
        System.out.println(carList);
        for(int i=0; i<=times; i++){
            for(int j=0; j<cars; j++){
                System.out.println(carList.get(j).get(i));
            }
            System.out.println();
        }
    }

    public static void main (String [] args){
        CarServiceimpl inmpl = new CarServiceimpl();
        inmpl.recursiveCar(3,5);
    }
}

/**
 1.
 map으로 받는걸 RacingGame 객체로 맵핑하고
 Car 라는 리스트에다가 <RacingGame> 이런식으로 넣으면
 자동차 3개, 시도 5번 인 경우
 0 -> map<RacingGame>
 1 -> map<RacingGame>
 2 -> map<RacingGame>
 이런식으로 출력하면됨

 2.
 enum활용
 true -> "-"
 false -> ""
 맵핑하기
 */