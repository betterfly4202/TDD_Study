package bridge;

import common.Utils;
import dto.MOVING_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

public class RacingGameImpl extends RacingGame {
    private int cars, times;
    private Map<Integer, List<String>> racingCarList = new HashMap<>();

    private List <String> moveStateList;

    protected RacingGameImpl(int cars, int times, Map<Integer, List<String>> racingCarList,  RacingAPI racingAPI) {
        super(racingAPI);
        this.cars = cars;
        this.times = times;
        this.racingCarList = racingCarList;
    }

    @Override
    public MOVING_TYPE checkMovingCount(int randNum) {
        if(randNum > 4 )
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }

    @Override
    public String additionalMovementToString(MOVING_TYPE type) {
        if(moveStateList.size() < 1){
            return type.getType();
        }
        return moveStateList.get(moveStateList.size()-1)+type.getType();
    }

    @Override
    public int stackUpMoveList(int times, List<String> moveStateList) {
        if(times < 1)
            return times;

        moveStateList.add(additionalMovementToString(checkMovingCount(Utils.extractMoveNumber())));

        return stackUpMoveList(times-1, moveStateList);
    }

    @Override
    public int recursiveRacingGame(int cars, int times) {
        if(cars < 1)
            return cars;

        moveStateList  = new ArrayList<>();
        stackUpMoveList(times, moveStateList);
        racingCarList.put(cars, moveStateList);

        return recursiveRacingGame(cars-1, times);
    }
}
