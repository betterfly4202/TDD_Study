package com.blackjack.webservice.entity;

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
    private CardDeck cardDeck;

    public Player(PlayerEntity player, int costs){
        this.cardDeck = new CardDeck();
        userCardRepository = new ArrayList<>();
        this.player = player;
        this.costs = costs;
    }

    public Player(PlayerEntity player){
        this.cardDeck = new CardDeck();
        userCardRepository = new ArrayList<>();
        this.player = player;
    }

    //TODO: stack에서 뽑은 카드를 usercardRepository에 넣어야 함.. 이걸 list로 둘 건지, 그냥 stack으로 바로 쓸건지 고민해보면 될듯...
    public List<Card> getUserCardDeckList(){
        for(int i=0; i<2; i++){
            userCardRepository.add(cardDeck.getCardEntity());
        }
        return userCardRepository;
    }

    public List<Card> getAllCardDeck(){
        return cardDeck.getCardDeckList();
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