package blackjack.entity;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static blackjack.entity.CardShapeEntity.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class PlayerTest {

    private CardDeck cardDeck;
    Player player;
    Player dealer;
    PlayerEntity user;

    @Before
    public void setUp(){
        cardDeck = new CardDeck();
        cardDeck.setCardDeckList();

        dealer = new Player(PlayerEntity.DEALER);
        player = new Player(PlayerEntity.USER, 2000);
    }

    @Test
    public void 유저_카드덱_기본(){
        player.defaultUserCardDeck(cardDeck.getCardEntity());
    }

    @Test
    public void 유저_카드덱_가져오기(){
        player.defaultUserCardDeck(cardDeck.getCardEntity());
        assertThat(player.getUserCardDeckList().size()).isEqualTo(2);
        assertThat(player.getUserCardDeckList().get(0)).extracting("cardShape").containsAnyOf(CLUB, HEART, DIAMOND, SPADE);
        assertThat(player.getUserCardDeckList().get(1)).extracting("cardShape").containsAnyOf(CLUB, HEART, DIAMOND, SPADE);
//        assertThat(player.getUserCardDeckList().get(2)).isNull();
    }

    @Test
    public void 유저_딜러_코스트_비교(){
        Assertions.assertThat(player.getCosts()).isEqualTo(2000);
        Assertions.assertThat(dealer.getCosts()).isNotNull();

    }
}
