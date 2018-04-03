package domain;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */

import entity.CarMovingList;
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
//        game.output(game.getGameResult());
//        game.getGameResult();
        for(int i=0; i<game.setGameResult().getCarInfo().size(); i++){
//            System.out.println(game.carMoveResult(game.setGameResult() ,i));
        }
    }

    @Test
    public void 라운드결과_리스트(){
        CarMovingList list;

        for(int i=0; i<game.cars; i++){
            list = game.resultInCars(game.setGameResult(), i);
            System.out.println(i+"라운드 : ");
            for(int j=0; j<game.rounds; j++){
                System.out.println(game.resultInRounds(list, j));
            }
            System.out.println();
        }

    }

    @Test
    public void 순위길이(){
        for(int i=0; i<game.cars; i++) {
            game.moveLength(game.setGameResult(), i);
        }
    }

}