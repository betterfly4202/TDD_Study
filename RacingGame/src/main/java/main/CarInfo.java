package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarInfo {
    int cars;
    int times;
    boolean move;

    public CarInfo(int times, boolean move){
        this.times = times;
        this.move = move;
    }

    public CarInfo() {

    }



    public static void main(String [] args){
        HashMap map = new HashMap<>();
        List<HashMap> carList = new ArrayList<>();
        CarInfo carInfo = new CarInfo();

        map.put(carInfo.times,carInfo.move);
    }
}