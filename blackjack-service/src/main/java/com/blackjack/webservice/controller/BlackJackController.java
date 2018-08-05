package com.blackjack.webservice.controller;

import com.blackjack.webservice.entity.Card;
import com.blackjack.webservice.entity.CardDeck;
import com.blackjack.webservice.entity.Player;
import com.blackjack.webservice.entity.PlayerEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 27.
 * Github : http://github.com/betterfly88
 */

@Controller
@RequestMapping("/api")
public class BootController {

    @GetMapping("/main")
    public String main(Model model){
        return "main";
    }

    @GetMapping("/")
    public String main(){
        return "result";
    }

    @GetMapping("/cardDeck/user")
    @ResponseBody
    public List<Card> playerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player player = new Player(PlayerEntity.USER, 2000);
        List<Card> userCard = player.getUserCardDeckList();

        return userCard;
    }

    @GetMapping("/cardDeck/dealer")
    @ResponseBody
    public List<Card> dealerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player dealer = new Player(PlayerEntity.DEALER);
        List<Card> dealerCard = dealer.getUserCardDeckList();

        return dealerCard;
    }
}
