package blackjack.entity;

import java.util.List;

/**
 * Created by betterFLY on 2018. 5. 12.
 * Github : http://github.com/betterfly88
 */

public enum PlayerEntity {
    USER("USER"),
    DEALER("DEALER");

    final private String player;

    PlayerEntity(String player) {
        this.player = player;
    }
}