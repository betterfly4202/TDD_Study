package blackjack.entity;

import java.util.ArrayList;
import java.util.List;

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

    private boolean countDealerCardPoint(List<Card> card){
        //TODO : 딜러인 경우 처음 카드 2장의 합이 16점 이하이면 카드를 한장 더 뽑고,
        // 17점 이상이면 random(50%)로 카드를 뽑음 > 뽑은 다음 또 뽑을지 계속 무한...
        // >> 유저가 hit할떄마다 50% 확률로 뽑을지 말지를 따라가면 됨
        boolean underSixteen = false;

        return underSixteen;
    }
}