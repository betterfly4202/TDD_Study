package com.blackjack.webservice.entity;

/**
 * Created by betterFLY on 2018. 5. 12.
 * Github : http://github.com/betterfly88
 */

public enum PlayerEntity {
    USER("USER"),
    DEALER("DEALER");

    public String player;

    PlayerEntity(String player) {
        this.player = player;
    }

    public String getPlayer(){
        return player;
    }

}