package entity;

/**
 * Created by betterFLY on 2018. 3. 31.
 * Github : http://github.com/betterfly88
 */
import dto.MOVING_TYPE;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    private RacingCar car;

    @Before
    public void setUp(){
        car = new RacingCar(3);
    }

    @Test
    public void 자동차_이동리스트(){
        car.makeCarRacingInfo(5);
        System.out.println(car.getCarInfo());

        car.sysOutCarInfo();

//        assertThat(state.getMoveList()).contains(MOVING_TYPE.MOVE);
    }
}
