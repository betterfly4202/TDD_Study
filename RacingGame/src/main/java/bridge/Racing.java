package bridge;

import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 12.
 * Github : http://github.com/betterfly88
 */

public class Racing implements RacingAPI {

    @Override
    public void start(int cars, int times, Map<Integer, List<String>> racingCarList) {
        System.out.println(racingCarList);
    }
}
