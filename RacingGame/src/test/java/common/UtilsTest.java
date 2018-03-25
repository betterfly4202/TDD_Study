package common;

import common.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by betterFLY on 2018. 3. 24.
 * Github : http://github.com/betterfly88
 */

public class UtilsTest {

    Utils utils;

    @Before
    public void setUp(){
        System.out.println("setUp");

       utils = new Utils();
    }

    @Test
    public void 난수_확인() {
        int randomNum = utils.extractMoveNumber();

        assertThat(randomNum > 4)
                .as("난수가 4보다 크면 트루 리턴")
                .isEqualTo(true)
                ;
    }
}