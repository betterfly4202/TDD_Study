package main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceImplTest {

    CarServiceimpl carServiceimpl;

    @Before
    public void setUp(){
        System.out.println("setUp");
        carServiceimpl = new CarServiceimpl();
    }

    @Test
    public void 랜덤값_4이상_true_리턴() {
        Assert.assertEquals(true, carServiceimpl.checkMovingState(5));
    }
}
