package main;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class RacingGameControllerTest {
    @Before
    public void setUp(){
        System.out.println("setUp");
    }

    @Test
    public void 랜덤값_4이상_true_리턴() {
        System.out.println("랜덤값 나와라");

        Random rand = new Random();
        int min=0;
        int max = 9;

        int randomNum = rand.nextInt(max - min + 1) + min;
        Assert.assertEquals(randomNum>4, randomNum); // 단일 메서드로 종료
    }

}
