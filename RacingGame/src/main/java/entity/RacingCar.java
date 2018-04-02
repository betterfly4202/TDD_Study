package entity;

import domain.GameRound;
import domain.GameRoundImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 27.
 * Github : http://github.com/betterfly88
 */

public class RacingCar {
    // TODO 카 객체를 생성하면서 라운드 정보를 담기만 하면됨

    // TODO 어떻게 라운드 객체와 엮어야 할지 고민해야함
    // FIXME

    private int cars;
    private Map<Integer, CarMovingList> carInfo;
    private GameRoundImpl gameRound = new GameRoundImpl();

    public RacingCar(int cars){
        this.cars = cars;
//        this.rounds = rounds;
        this.carInfo = new HashMap<Integer, CarMovingList>();
    }

    public RacingCar(){
        this.carInfo = new HashMap<Integer, CarMovingList>();
    }

//    public Map<Integer, CarMovingList> makeCarRacingInfo(int round){
//        IntStream
//                .range(0, cars)
//                .forEach(i -> this.carInfo.put(i,gameRound.addRoundForCarMovement(round)));
//
//        return this.carInfo;
//    }

    public Map<Integer, CarMovingList> addCarRacingInfo(int cars, int rounds){
        this.carInfo.put(cars, gameRound.addRoundForCarMovement(rounds));

        return this.carInfo;
    }

    public Map<Integer, CarMovingList> getCarInfo(){

        return this.carInfo;
    }
}
