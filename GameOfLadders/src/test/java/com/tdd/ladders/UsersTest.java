package com.tdd.ladders;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by betterfly
 * Date : 2018.12.05
 */
public class UsersTest {
    private HashMap<Object, String> userMap;
    private HashMap<Integer, String> resultMap;
    private int participants; // 참가자
    private int winNumber; // 당첨 번호

    //ladder item
    private int ladderBase; // 사다리 기둥
    private int ladderBranch; // 사다리 다리 갯수

    @Before
    public void setUp(){
        System.out.println("GAME START");
        participants = 4;
        ladderBranch = 6;

        winNumber = 3; // <= participants
        ladderBase = participants;

        userMap = new HashMap<Object, String>();
        resultMap = new HashMap<Integer, String>();

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
        String branch = "_________";
        for(int i=1; i<=userMap.size(); i++){
            System.out.print(userMap.get(i));
            System.out.print("       ");
        }

        System.out.println();

        for(int i=0; i<10; i++){
            for(int j=0; j<userMap.size(); j++){
                System.out.print(base);

                if(j%2==0){
                    System.out.print(branch);
                }else{
                    System.out.print("         ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
