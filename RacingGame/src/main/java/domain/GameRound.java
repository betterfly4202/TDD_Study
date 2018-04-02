package domain;

import common.Utils;
import dto.MOVING_TYPE;
import entity.CarMovingList;

import java.util.stream.IntStream;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */
public interface GameRound {
    CarMovingList addRoundForCarMovement(int round);

}
