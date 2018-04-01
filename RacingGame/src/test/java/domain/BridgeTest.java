package domain;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

import org.junit.Before;
import org.junit.Test;

public class BridgeTest {
    RacingGameImpl racingGame;
    RacingGame racing;

    @Before
    public void setUp(){
        System.out.println("setUp");

    }

//    @Test
//    public void racing_game(){
//        racing.start(3,5);
//    }

    @Test
    public void racing(){
        racing = new RacingGameImpl(3, 5);
        racing.start();
    }


    @Test
    public void 차량별_이동정보(){
        racingGame.start();

    }

    @Test
    public void 스트림출력하기(){
        racing = new RacingGameImpl(3, 5);
//        racing.stream();
        racingGame = new RacingGameImpl(3, 5);
        racingGame.printMap();
    }

    @Test
    public void 리스트가져오기(){
//        CarMovingListTest state = new CarMovingListTest("aaa");
//        System.out.println(state.getCarMoveList());
    }
}

