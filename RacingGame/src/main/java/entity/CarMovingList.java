package entity;

import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 24.
 * Github : http://github.com/betterfly88
 */


public class CarMovingList {
    private List<MOVING_TYPE> carMoveList;

    public CarMovingList(){
        carMoveList = new ArrayList<>();

    }

    public List<MOVING_TYPE> addCarMoveState(MOVING_TYPE moveType){

        carMoveList.add(moveType);

        return this.carMoveList;
    }

    public List<MOVING_TYPE> getMoveList(){
        return this.carMoveList;
    }

}