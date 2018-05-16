package blackjack.domain;

import javax.smartcardio.Card;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class BlackJackServiceImpl implements BlackJackService {
    @Override
    public int isAce() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    @Override
    public Card isHit() {
        return null;
    }

    @Override
    public Card isStand() {
        return null;
    }

    @Override
    public Card isBust() {
        return null;
    }

    @Override
    public Card compareWithCard() {
        return null;
    }
}
