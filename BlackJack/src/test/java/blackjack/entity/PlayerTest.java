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
        player.getUserCardDeckList(cardDeck.getCardEntity());
    }

    @Test
    public void 유저_카드덱_가져오기(){
        List<Card> userCard = player.getUserCardDeckList(cardDeck.getCardEntity());
        assertThat(userCard.size()).isEqualTo(2);
        assertThat(userCard.get(0)).extracting("cardShape").containsAnyOf(CLUB, HEART, DIAMOND, SPADE);
        assertThat(userCard.get(1)).extracting("cardShape").containsAnyOf(CardShapeEntity.values());
        assertThat(userCard.get(0)).extracting("cardNum").containsAnyOf(CardNumberEntity.values());
        Assertions.assertThat(player.getCosts()).isEqualTo(2000);
//        assertThat(player.getUserCardDeckList().get(2)).isNull();
    }

    @Test
    public void 유저_딜러_코스트_비교(){
        Assertions.assertThat(player.getCosts()).isEqualTo(2000);
        Assertions.assertThat(dealer.getCosts()).isNotNull();

    }

    @Test
    public void 유저_카드확인(){
        Player p1 = new Player(PlayerEntity.DEALER);
        for (Card c : p1.getAllCardDeck()) {
            System.out.println(c.cardShape);
        }

        System.out.println(p1.getAllCardDeck().size());
    }

    @Test
    public void 유저_시작_카드계산(){
        List<Card> userCard = player.getUserCardDeckList(cardDeck.getCardEntity());
        int totalPoint = 0;

        for(blackjack.entity.Card card : userCard){
            totalPoint += card.cardNum.getCardNumber();
        }
        System.out.println(totalPoint);

        int sum = userCard.stream().map(card -> card.cardNum.getCardNumber()).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
