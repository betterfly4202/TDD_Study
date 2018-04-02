package domain;

import common.Utils;
import dto.MOVING_TYPE;
import entity.CarMovingList;

import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */
public class GameRound {

    private CarMovingList carMoveState;

    private MOVING_TYPE isCheckedMovingState(int randNum) {
        if(randNum > 4 )
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }

    private MOVING_TYPE getCarMovingStatement(){

        return isCheckedMovingState(Utils.extractMoveNumber());
    }

    public CarMovingList addRoundForCarMovement(int round){
        carMoveState = new CarMovingList();

        IntStream
                .range(0, round)
                .forEach(i -> carMoveState.addCarMoveState(getCarMovingStatement()));

        return carMoveState;
    }

}