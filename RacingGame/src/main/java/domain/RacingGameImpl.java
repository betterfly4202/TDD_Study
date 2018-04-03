package domain;

import common.Utils;
import dto.MOVING_TYPE;
import entity.CarMovingList;
import entity.RacingCar;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

public class RacingGameImpl extends RacingGame {
    public int cars;
    public int rounds;
    private RacingCar car;

    public RacingGameImpl(int cars, int rounds){
        this.cars = cars;
        this.rounds = rounds;
    }

    @Override
    protected RacingCar setGameResult() {
        car = new RacingCar(this.cars);

        IntStream
                .range(0, cars)
                .forEach(i -> car.addCarRacingInfo(i, this.rounds));

        return car;
    }

    //자동차 별 결과
    public CarMovingList resultInCars(RacingCar racingCar, int car){
        return racingCar.getCarInfo().get(car);
    }

    //라운드 별 결과
    public String resultInRounds(CarMovingList moveList, int round){
        return moveList.getStringMoveList().get(round);
    }

    public int moveLength(RacingCar racingCar, int car){
        return racingCar.getCarInfo().get(car).getStringMoveList().get(this.rounds).length();
    }

    //TODO MAP + LIST로 결과받으니까 객체 관리가 너무나 까다롭다
    //TODO 1. compareTo 사용해서 List의 Length 중 가장 높은 것을 찾아야 하고
    //TODO 2. 각각의 라운드 별 결과를 분리해서 출력해야한다.
}