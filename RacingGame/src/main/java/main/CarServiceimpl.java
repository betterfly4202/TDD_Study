package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarServiceimpl implements CarService{
    enum MOVING_TYPE{
        MOVE("-"), STOP("");

        final private String type;

        private MOVING_TYPE(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }

    @Override
    public int extractMoveNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    @Override
    public MOVING_TYPE checkMovingState(int num) {
        if(num > 4)
            return MOVING_TYPE.MOVE;

        return MOVING_TYPE.STOP;
    }

    @Override
    public int recursiveCar(int cars){
        System.out.println(cars);
        if(cars < 1)
            return cars;

        return recursiveCar(cars-1);
    }

    static Map<Integer, MOVING_TYPE> map = new HashMap();

    @Override
    public int recursiveTimes(int times){
        if(times < 1)
            return times;

        CarServiceimpl carServiceimpl = new CarServiceimpl();
        /**
           1.
                map으로 받는걸 CarInfo 객체로 맵핑하고
                Car 라는 리스트에다가 <CarInfo> 이런식으로 넣으면
                자동차 3개, 시도 5번 인 경우
                0 -> map<CarInfo>
                1 -> map<CarInfo>
                2 -> map<CarInfo>
                이런식으로 출력하면됨

            2.
                enum활용
                true -> "-"
                false -> ""
                맵핑하기
         */
        //map.put(times, carServiceimpl.checkMovingState(carServiceimpl.extractMoveNumber(0,9)));
        map.put(times, checkMovingState(extractMoveNumber(0,9)));

        return recursiveTimes(times-1);
    }

    public static void main(String [] args){
        CarServiceimpl impl = new CarServiceimpl();
        impl.recursiveTimes(5);

        System.out.println(map);
        System.out.println(map.get(1));
    }
}
