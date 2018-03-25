package entity;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */
import dto.MOVING_TYPE;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.assertj.core.api.Assertions.*;

public class CarMoveStateTest {
    private CarMoveState state;

    @Before
    public void setUp(){
        state = new CarMoveState();
    }

    @Test
    public void 자동차_이동리스트(){
        state.addCarMoveState(MOVING_TYPE.MOVE);
        assertThat(state.getMoveList()).contains(MOVING_TYPE.MOVE);
    }
}
