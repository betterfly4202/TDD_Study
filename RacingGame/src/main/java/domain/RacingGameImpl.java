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
    private int cars, rounds;
    private RacingCar car;

    public RacingGameImpl(int cars, int rounds){
        this.cars = cars;
        this.rounds = rounds;
    }

    @Override
    protected RacingCar getGameResult() {
        car = new RacingCar(this.cars);

        IntStream
                .range(0, cars)
                .forEach(i -> car.addCarRacingInfo(i, this.rounds));

        return car;
    }

    public void output(RacingCar car){
        for(int i=0; i<this.cars; i++){
            System.out.println("라운드 : "+i);
            for(int j=0; j<rounds; j++){
                System.out.println(car.getCarInfo().get(i).getMoveList().get(j).getType());
            }
        }
    }
}