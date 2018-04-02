package domain;

import dto.MOVING_TYPE;
import entity.RacingCar;

import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 11.
 * Github : http://github.com/betterfly88
 */

abstract class RacingGame {
    protected abstract void start();

    protected abstract RacingCar racingGameProcess(int rounds);
}