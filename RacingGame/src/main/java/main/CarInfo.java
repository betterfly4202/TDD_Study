package main;

import dto.MOVING_TYPE;
import service.CarServiceimpl;

import java.util.HashMap;
import java.util.List;

/**
 * Created by betterFLY on 2018. 3. 6.
 * Github : http://github.com/betterfly88
 */

public class CarInfo extends CarServiceimpl {
    int cars;
    int times;
    List<HashMap<Integer, MOVING_TYPE>> carList;

    public CarInfo(int cars, int times){
        this.cars = cars;
        this.times = times;
        this.carList = carList;
    }

    @Override
    public int recursiveCar(int cars, int times, List<HashMap<Integer, MOVING_TYPE>> carList) {
        return super.recursiveCar(this.cars, this.times, this.carList);
    }
}


/**
 *
 * 클래스 생성자 선언하고..
 * 최종 결과 출력 메서드 실행하면
 * 결과를 얻고 싶음
 *
 * CarInfo라는 메인 클래스의 생성자를 통해서..
 */