package entity;

import domain.GameRound;

import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 27.
 * Github : http://github.com/betterfly88
 */

public class RacingCar {
    //TODO 카 객체를 생성하면서 라운드 정보를 담기만 하면됨

    // TODO 어떻게 라운드 객체와 엮어야 할지 고민해야함
    // FIXME

    private int cars;
    private int round;
    private Map<Integer, CarMovingList> carInfo;
    private GameRound gameRound = new GameRound();

    RacingCar(int cars){
        this.cars = cars;
        makeCarRacingInfo(this.round);
    }

    RacingCar(){

    }

    public Map<Integer, CarMovingList> makeCarRacingInfo(int round){
        carInfo.put(cars, gameRound.addRoundForCarMovement(round));
        return carInfo;
    }

    public Map<Integer, CarMovingList> getCarInfo(){
        return carInfo;
    }
}
