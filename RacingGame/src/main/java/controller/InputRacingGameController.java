package controller;

import common.Constant;
import common.Utils;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */

public class InputRacingGameController {
    public int getRoundNumber(){

        return Utils.inputRacingGameConfig(Constant.RACING_ROUNS);
    }

    public int getCarNumber(){

        return Utils.inputRacingGameConfig(Constant.RACING_CARS);
    }
}
