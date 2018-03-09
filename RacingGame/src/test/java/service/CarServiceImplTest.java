package service;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void 차량별_이동정보(){

        carServiceimpl.outputList(3, 5);

    }
}
