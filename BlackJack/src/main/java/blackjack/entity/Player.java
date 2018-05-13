package blackjack.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 12.
 * Github : http://github.com/betterfly88
 */

public class Player {
    private PlayerEntity player;
    private List<Card> userCardRepository;

    Player(PlayerEntity player){
        userCardRepository = new ArrayList<>();
        this.player = player;
    }

    public void defaultUserCardDeck(Card card){
        for(int i=0; i<2; i++){
            userCardRepository.add(card);
        }
    }

    public List<Card> getUserCardDeckList(){
        return userCardRepository;
    }
}