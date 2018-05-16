package blackjack.domain;

import javax.smartcardio.Card;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public interface BlackJackService {
    public int isAce();

    public boolean isBlackJack();

    public Card isHit();

    public Card isStand();

    public Card isBust();

    public Card compareWithCard();

}
