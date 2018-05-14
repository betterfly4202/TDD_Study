package blackjack.entity;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
/**
 * Created by betterFLY on 2018. 5. 14.
 * Github : http://github.com/betterfly88
 */

public class BettingCostsTest {

    BettingCosts costs;

    @Test
    public void 유저_기본_베팅액_세팅(){
        Assertions.assertThat(BettingCosts.costs).isEqualTo(2000);
    }


}
