package service;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarServiceImplTempTest {


    CarServiceImplTemp carServiceImplTemp;

    @Before
    public void setUp(){
        System.out.println("setUp");
        carServiceImplTemp = new CarServiceImplTemp();
    }
    @Test
    public void 차량별_이동정보(){
        String a = carServiceImplTemp.additionalMovingState(3, "-");

        System.out.println(a);

        String b = carServiceImplTemp.additionalMoving(3);
        System.out.println(b);
    }
}
