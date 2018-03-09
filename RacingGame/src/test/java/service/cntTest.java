package service;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class cntTest {


    CarServiceImplCnt cnt;

    @Before
    public void setUp(){
        System.out.println("setUp");
        cnt = new CarServiceImplCnt();
    }

    @Test
    public void 차량별_이동정보(){
        cnt.test(3 ,5);
    }
}
