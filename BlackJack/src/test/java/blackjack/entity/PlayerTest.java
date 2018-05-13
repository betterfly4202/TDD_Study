package blackjack.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class PlayerTest {

    private CardDeck cardDeck;
    private List<Card> userCardRepository;

    @Before
    public void setUp(){
        cardDeck = new CardDeck();
        cardDeck.setCardDeckList();

        userCardRepository = new ArrayList<>();
    }

    @Test
    public void 유저_카드덱_기본(){
        for(int i=0; i<2; i++){
            userCardRepository.add(cardDeck.getCardEntity());
        }
        System.out.println(userCardRepository.get(0).cardShape);
        System.out.println(userCardRepository.get(0).cardNum);
        System.out.println(userCardRepository.get(1).cardShape);
        System.out.println(userCardRepository.get(1).cardNum);
    }
}
