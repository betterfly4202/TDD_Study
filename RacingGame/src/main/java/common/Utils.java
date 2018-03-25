package common;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */

public class Utils {
    public static int extractMoveNumber(){
        Random rand = new Random();
        return rand.nextInt(10);
    }

    private static int makeScannerInstance(){
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static int inputRacingGameConfig(String comment){
        int inputNum;

        while(true){

            System.out.print("게임에 참가할 "+ comment + "을(를) 입력해주세요 : ");
            try {
                inputNum = makeScannerInstance();
                break;
            }catch (InputMismatchException e){
                System.out.println("숫자(정수)만 입력해주세요.");
            }
        }
        return inputNum;
    }

}
