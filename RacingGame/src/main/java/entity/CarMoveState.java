package entity;

import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 24.
 * Github : http://github.com/betterfly88
 */

public class CarMoveState {
    // 이건 List
    private int times = 0;
    private static String[] carMovement = new String[100];

    private List<String> carMoveList;

    CarMoveState(List<String> carMoveList){
        this.carMoveList = carMoveList;
    }

    CarMoveState(int times){
        this.times = times;
    }

    public boolean setMoveState(String movement){
        carMovement[times] = movement;
        times++;

        return true;
    }

    public final static void main(String [] args){
        CarMoveState s = new CarMoveState(5);
        s.setMoveState("zz");
        s.setMoveState("az");
        s.setMoveState("ssz");
        s.setMoveState("zDfsaz");
        s.setMoveState("zadfss");

        for(String temp:carMovement)
            System.out.println(temp);
    }
}
