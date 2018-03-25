import controller.InputRacingGameController;
import domain.RacingGameImpl;

import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class RacingGameMain {

    public static void main(String [] args) {
        InputRacingGameController controller = new InputRacingGameController();
        int cars = controller.getCarNumber();
        int rounds = controller.getRoundNumber();
        RacingGameImpl racingGame = new RacingGameImpl(cars, rounds);
        racingGame.start();
    }

}
