package domain;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */

import dto.MOVING_TYPE;
import entity.CarMoveState;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameInRoundTest {
    private RacingGameInRound round;

    @Before
    public void setUp(){
        round = new RacingGameInRound();
    }


    @Test
    public void 라운드_결과(){
        round.addRoundForCarMovement(5);
        round.aaa();
    }

}