package entity;

import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 24.
 * Github : http://github.com/betterfly88
 */

public class CarMoveState {
    // 이건 List
    private int times = 0;

    private List<MOVING_TYPE> carMoveList;


    public CarMoveState(int times){
        carMoveList = new ArrayList<>();

//        IntStream
//                .range(0,times)
//                .forEach(i -> getMoveType());

    }

    public List<MOVING_TYPE> getCarMoveList(){
        return this.carMoveList;
    }

}
