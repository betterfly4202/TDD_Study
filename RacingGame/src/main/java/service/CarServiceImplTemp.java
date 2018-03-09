package service;

import common.Utils;
import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceImplTemp implements CarService{
    List<HashMap<Integer, MOVING_TYPE>> carList = new ArrayList<>();

    List <ArrayList<String>> carMoveList = new ArrayList<>();
    private int moveCnt = 0;

    @Override
    public MOVING_TYPE checkMovingState(int num) {
        if(num > 4) {
            moveCnt++;
            return MOVING_TYPE.MOVE;
        }

        return MOVING_TYPE.STOP;
    }

    public String checkMovingStateString(int num) {
        if(num > 4){
            moveCnt++;
            return MOVING_TYPE.MOVE.getType();
        }


        return MOVING_TYPE.STOP.getType();
    }


    /*
        차량 토탈 이동 정보
     */
    @Override
    public int recursiveCar(int cars, int times){
        if(cars < 1)
            return cars;
        ArrayList<String> moveStateList = new ArrayList<>();
        recursiveTimesWithList(times,moveStateList);
        carMoveList.add(moveStateList);

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

//        String temp = checkPreviousMovingState(moveStateList, checkMovingStateString(Utils.extractMoveNumber(0, 9)));

        String temp = additionalMovingState(moveCnt, checkMovingStateString(Utils.extractMoveNumber()));
        moveStateList.add(temp);

        return recursiveTimesWithList(times-1, moveStateList);
    }

    public String checkPreviousMovingState(ArrayList<String> moveStateList, String movingState){
        if(moveStateList.size()-1 < 1)
            return movingState;

        if(moveStateList.get(moveStateList.size()-1).equals(MOVING_TYPE.MOVE)){
            return moveStateList.get(moveStateList.size()-1)+MOVING_TYPE.MOVE.getType();
        }

        return moveStateList.get(moveStateList.size()-1);
    }

    public String additionalMovingState(int moveCnt, String movingState){
        if(moveCnt < 2)
            return movingState;

        movingState += movingState;
//        String tempMovingState = null;
//        for(int i=0; i<moveCnt; i++){
//            tempMovingState += MOVING_TYPE.MOVE.getType();
//        }
        return additionalMovingState(moveCnt -1 , movingState);
    }

    public String additionalMoving(int moveCnt){
        String tempMovingState="";
        for(int i=0; i<moveCnt; i++){
            tempMovingState += MOVING_TYPE.MOVE.getType();
        }
        return tempMovingState;
    }



    public void outputList(int cars, int times){
        recursiveCar(cars, times);
        System.out.println(carMoveList);
        for(int i=0; i<times; i++){
            for(int j=0; j<cars; j++){
                System.out.println(carMoveList.get(j).get(i));
            }
            System.out.println();
        }
    }

    public static void main (String [] args){
        CarServiceImplTemp inmpl = new CarServiceImplTemp();
        inmpl.outputList(3,5);
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