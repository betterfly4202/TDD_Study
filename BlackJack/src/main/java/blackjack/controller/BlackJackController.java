package blackjack.controller;

import blackjack.entity.Card;
import blackjack.entity.CardDeck;
import blackjack.entity.Player;
import blackjack.entity.PlayerEntity;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by betterFLY on 2018. 5. 15.
 * Github : http://github.com/betterfly88
 */

public class BlackJackController {
    public static void main(String [] args){

//        staticFiles.location("/static");
        get("/black-jack", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            model.put("playerDeck", playerCardDeck());
            model.put("dealerDeck", dealerCardDeck());

            return render(model, "main.html");
        });

        post("/result",(req, res) ->{
            Map<String, Object> model = new HashMap<>();

            return render(model, "result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

    public static List<Card> playerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player player = new Player(PlayerEntity.USER, 2000);
        List<Card> userCard = player.getUserCardDeckList(cardDeck.getCardEntity());

        return userCard;
    }

    public static List<Card> dealerCardDeck(){
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeckList();
        Player dealer = new Player(PlayerEntity.DEALER);
        List<Card> dealerCard = dealer.getUserCardDeckList(cardDeck.getCardEntity());

        return dealerCard;
    }
}
