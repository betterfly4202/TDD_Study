package blackjack.entity;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class CardNumberTest{

    CardNumberEntity numberEntity;

    @Before
    public void setUp(){

    }


    @Test
    public void 카드객체_숫자_리스트_검증(){
        Assertions.assertThat(numberEntity.values().length).isEqualTo(13);
        Assertions.assertThat(numberEntity.ACE.getNumber()).isEqualTo("1");
        Assertions.assertThat(numberEntity.valueOf("ACE").toString()).contains("ACE");

    }

    @Test
    public void 에이스_숫자결정(){

    }

    @Test
    public void 카드덱_만들기(){

    }
}
