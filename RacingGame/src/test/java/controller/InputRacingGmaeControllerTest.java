package controller;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */

public class InputRacingGmaeControllerTest {

    private InputRacingGameController inputRacingGameController;

    @Before
    public void setup(){
        inputRacingGameController = new InputRacingGameController();
    }

    @Test
    public void 라운드_얻기(){
        inputRacingGameController.getRoundNumber();
    }
}
