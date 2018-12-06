package com.tdd.ladders;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;
/**
 * Created by betterfly
 * Date : 2018.12.05
 */
public class UsersTest {
    private HashMap<Object, String> userMap;
    private HashMap<Integer, String> resultMap;
    private int participants;
    private int winNumber;

    //ladder item
    private int ladderBase;
    private int ladderBranch;

    @Before
    public void setUp(){
        System.out.println("GAME START");
        participants = 4;
        ladderBranch = 6;

        winNumber = 3; // < participants
        ladderBase = participants;

        userMap = new HashMap<Object, String>();

        userMap.put(1, "충일");
        userMap.put(2, "진열");
        userMap.put(3, "윤복");
        userMap.put(4, "진형");

        resultMap.put(winNumber, "당첨");
    }

    @Test
    public void test(){
        System.out.println(userMap.entrySet());
    }

    @Test
    public void ladderGame(){
        String base = "|";
        String branch = "----";

    }
}
