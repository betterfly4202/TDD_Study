package main;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */


import builder.CarInfo;
import dto.MOVING_TYPE;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CarInfoTest {

    CarInfo carInfo;
    @Before
    public void setUp(){
        System.out.println("setUp");
        carInfo = new CarInfo();
    }

    @Test
    public void CarInfo_통한_생성() {
//        Assert.assertEquals(true, carServiceimpl.checkMovingState(5));
        List<HashMap<Integer, MOVING_TYPE>> carList = new ArrayList<>();
        carInfo.recursiveCar(3,5);
        System.out.println(carList);
    }


}
