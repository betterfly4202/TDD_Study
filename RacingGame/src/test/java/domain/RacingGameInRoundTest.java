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
    private RacingGameImpl game;

    @Before
    public void setUp(){
        game = new RacingGameImpl(3,5);
        round = new GameRoundImpl();
    }


    @Test
    public void 라운드_결과(){
        round.addRoundForCarMovement(5);
    }

    @Test
    public void 결과(){
//        game.getGameResult();
//        game.output(game.getGameResult());
//        game.getGameResult();
        for(int i=0; i<game.setGameResult().getCarInfo().size(); i++){
//            System.out.println(game.carMoveResult(game.setGameResult() ,i));
        }


    }

}