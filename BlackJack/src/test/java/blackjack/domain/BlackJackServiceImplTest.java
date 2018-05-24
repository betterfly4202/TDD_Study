package blackjack.domain;

import blackjack.entity.*;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class BlackJackServiceImplTest {
    BlackJackServiceImpl cardService;
    Player player;
    CardDeck cardDeck;

    @Before
    public void setUp(){
        player = new Player(PlayerEntity.USER, 2000);
        cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        cardService = new BlackJackServiceImpl();
    }

    @Test
    public void ACE_체크(){
        Assertions.assertThat(cardService.isAce(CardNumberEntity.ACE)).isTrue();
        Assertions.assertThat(cardService.isAce(CardNumberEntity.QUEEN)).isFalse();
    }

    @Test
    public void 보유카드_계산기(){
        List<Card> userCard = player.getUserCardDeckList(cardDeck.getCardEntity());
        int totalCardPoint = cardService.sumCardPoint(userCard);
        Assertions.assertThat(totalCardPoint).isGreaterThan(1);
        System.out.println(totalCardPoint);
    }

    @Test
    public void 카드_오픈() {
        Card card = cardService.isHit(cardDeck);
        Assertions.assertThat(card.cardShape).extracting(cardShapeEntity -> card.cardNum);
        System.out.println(card.cardShape);
        System.out.println(card.cardNum);
        System.out.println(cardDeck.getCardDeckList().size());
    }

    @Test
    public void 게임결과(){

    }
}
