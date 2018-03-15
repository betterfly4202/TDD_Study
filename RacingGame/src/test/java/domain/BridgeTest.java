package domain;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */



import org.junit.Before;
import org.junit.Test;

public class BridgeTest {
    RacingGameImpl racingGame;
    Racing racing;

    @Before
    public void setUp(){
        System.out.println("setUp");
        racing = new Racing();
        racingGame = new RacingGameImpl(3,5, (cars, times) -> racingGame.start());
//        racingGame = new RacingGameImpl(3,5);
    }

    @Test
    public void racing_game(){
        racing.start(3,5);
    }
    @Test
    public void 차량별_이동정보(){
        racingGame.start();
/**
 * 하고 싶은 작업..
 *
 * RacingGame 이라는 클래스를 생성하고
 * 인스턴스에 car 정보 times 정보만 넣은 담에
 * racingGame.start();
 * 날려주면 race 결과가 출력되어야 함..
 *
 * 생성자 파라미터로 Map을 받아야 할까
 * 받지 않아도 되나?
 *
 * start를 눌렀을떄 어떻게 하면 Map정보를 전부 출력할 수 있지?
 */


    }

}

