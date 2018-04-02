package domain;

import common.Utils;
import dto.MOVING_TYPE;
import entity.RacingCar;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

public class RacingGameImpl extends RacingGame {
    private int cars, times;

    public RacingGameImpl(int cars, int times){
        this.cars = cars;
        this.times = times;
    }

    @Override
    protected void start() {

    }

    public RacingCar racingGameProcess(int rounds){
        RacingCar car = new RacingCar(this.cars);

        IntStream
            .range(0, cars)
            .forEach(i -> car.addCarRacingInfo(i, rounds));

        return car;
    }
}