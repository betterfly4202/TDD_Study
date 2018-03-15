package bridge;

import dto.MOVING_TYPE;

import java.util.HashMap;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 11.
 * Github : http://github.com/betterfly88
 */

abstract class RacingGame {
    protected RacingAPI racingAPI;

    protected RacingGame(RacingAPI racingAPI){
        this.racingAPI = racingAPI;
    }

    public abstract void start();

    public abstract MOVING_TYPE checkMovingCount(int num);

    public abstract String additionalMovementToString(MOVING_TYPE type);

    public abstract int stackUpMoveList(int times, List<String> moveStateList);

    public abstract int recursiveRacingGame(int cars);
}