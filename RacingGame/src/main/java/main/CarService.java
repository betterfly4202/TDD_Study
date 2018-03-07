package main;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public interface CarService {
    int extractMoveNumber(int min, int max);
    CarServiceimpl.MOVING_TYPE checkMovingState(int num);

    int recursiveCar(int cars);
    int recursiveTimes(int times);
}
