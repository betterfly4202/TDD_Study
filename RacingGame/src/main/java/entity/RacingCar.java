package entity;

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
    Map<Integer, CarMoveState> carInfo;

    RacingCar(int cars){
        this.cars = cars;
    }

}
