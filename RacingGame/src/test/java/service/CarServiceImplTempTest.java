package service;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */


import common.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarServiceImplTempTest {


    CarServiceImplTemp carServiceImplTemp;

    Utils utils;

    @Before
    public void setUp(){
        System.out.println("setUp");
        carServiceImplTemp = new CarServiceImplTemp();
        utils = new Utils();
    }
    @Test
    public void 차량별_이동정보(){
        String a = carServiceImplTemp.additionalMovingState(3, "-");

        System.out.println(a);

        String b = carServiceImplTemp.additionalMoving(3);
        System.out.println(b);
    }

    @Test
    public void 랜덤값_추출(){
        for(int i=0; i<20; i++){
            System.out.println(utils.extractMoveNumber());
        }
    }
}
