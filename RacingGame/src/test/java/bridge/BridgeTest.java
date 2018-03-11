package bridge;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */



import org.junit.Before;
import org.junit.Test;
import service.CarServiceImplCnt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BridgeTest {
    RacingGameImpl racingGame;
    private Object Map;

    @Before
    public void setUp(){
        System.out.println("setUp");
    }

    @Test
    public void 차량별_이동정보(){
        java.util.Map<Integer, List<String>> racingCarList = new HashMap<>();
        RacingGame race = new RacingGameImpl(3, 5,racingCarList, new RacingAPI());



    }

}

