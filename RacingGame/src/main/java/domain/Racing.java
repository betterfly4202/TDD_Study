package domain;

import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

public class Racing implements RacingAPI {
    private Map<Integer, List<String>> racingCarList;

    @Override
    public void start(int cars, int times) {
        System.out.println(racingCarList);
    }
}
