package blackjack.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by betterFLY on 2018. 5. 12.
 * Github : http://github.com/betterfly88
 */

public class Player{
    private PlayerEntity player;
    private int costs;
    private List<Card> userCardRepository;

    Player(PlayerEntity player, int costs){
        userCardRepository = new ArrayList<>();
        this.player = player;
        this.costs = costs;
    }

    Player(PlayerEntity player){
        userCardRepository = new ArrayList<>();
        this.player = player;
    }

    private void defaultUserCardDeck(Card card){
        for(int i=0; i<2; i++){
            userCardRepository.add(card);
        }
    }

    public List<Card> getUserCardDeckList(Card card){
        defaultUserCardDeck(card);
        return userCardRepository;
    }

    public int getCosts(){
        return costs;
    }
}