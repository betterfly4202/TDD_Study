package com.tdd.ladders;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by betterfly
 * Date : 2018.12.04
 */
public class Start {
    final static HashMap<Object, String> userMap = new HashMap<Object, String>();

    public static void main(String[] args) {
        System.out.println("GAME START !!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("게임에 참가할 인원을 입력해주세요 : ");
        int participants = sc.nextInt();

        for(int i=1; i<=participants; i++){
            System.out.print(i+"번째 참가자 : ");
            String user = sc.nextLine();
            userMap.put(i, user);
        }

        System.out.println(userMap.entrySet());
    }
}
