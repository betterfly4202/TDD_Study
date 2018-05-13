package blackjack.domain;

import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 5. 13.
 * Github : http://github.com/betterfly88
 */

public class CardServiceImpl implements CardService{
    @Override
    public int isAce() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
