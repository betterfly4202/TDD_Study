package domain;

import dto.MOVING_TYPE;

import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 11.
 * Github : http://github.com/betterfly88
 */

abstract class RacingGame {
    protected abstract void start();

    protected abstract MOVING_TYPE getCarMovingStatement(int num);

    protected abstract String additionalMovementToString(MOVING_TYPE type);

    protected abstract int stackUpMoveList(int times, List<String> moveStateList);

    protected abstract int recursiveRacingGame(int cars);

    protected abstract void stream();

}