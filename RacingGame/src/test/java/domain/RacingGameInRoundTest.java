package domain;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameInRoundTest {
    private GameRound round;

    @Before
    public void setUp(){
        round = new GameRound();
    }


    @Test
    public void 라운드_결과(){
        round.addRoundForCarMovement(5);
    }

}