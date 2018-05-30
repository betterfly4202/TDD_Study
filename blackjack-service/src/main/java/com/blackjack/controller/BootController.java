package com.blackjack.controller;

import com.blackjack.entity.Card;
import com.blackjack.entity.CardDeck;
import com.blackjack.entity.Player;
import com.blackjack.entity.PlayerEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 27.
 * Github : http://github.com/betterfly88
 */

@Controller
public class BootController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("player",playerCardDeck());
        model.addAttribute("dealer",dealerCardDeck());
        return "main";
    }


    public List<Card> playerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player player = new Player(PlayerEntity.USER, 2000);
        List<Card> userCard = player.getUserCardDeckList();

        return userCard;
    }

    public List<Card> dealerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player dealer = new Player(PlayerEntity.DEALER);
        List<Card> dealerCard = dealer.getUserCardDeckList();

        return dealerCard;
    }
}
