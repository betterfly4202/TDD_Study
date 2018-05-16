package blackjack.domain;

import blackjack.entity.CardNumberEntity;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class BlackJackServiceImplTest {
    BlackJackServiceImpl cardService;

    @Before
    public void setUp(){
        cardService = new BlackJackServiceImpl();
    }

    @Test
    public void ACE_체크(){
        Assertions.assertThat(cardService.isAce(CardNumberEntity.ACE)).isTrue();
        Assertions.assertThat(cardService.isAce(CardNumberEntity.QUEEN)).isFalse();
    }
}
