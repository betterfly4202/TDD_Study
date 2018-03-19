package main;

import domain.RacingGameImpl;

import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class RacingGameController {
    public static void main(String [] args) {
        int cars = getCars();
        int times = getTimes();
        RacingGameImpl racingGame = new RacingGameImpl(cars, times);
        racingGame.start();
    }

    public static int getCars(){
        Scanner cars = new Scanner(System.in);
        System.out.print("경주에 참여할 자동차 수를 입력해주세요 : ");
        return cars.nextInt();
    }

    public static int getTimes(){
        Scanner times = new Scanner(System.in);
        System.out.print("진행할 라운드를 입력해주세요 : ");

        return times.nextInt();
    }
}
