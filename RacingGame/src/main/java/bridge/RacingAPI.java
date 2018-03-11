package bridge;

import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 11.
 * Github : http://github.com/betterfly88
 */

public interface RacingAPI {
    public void start(int cars, int times, Map<Integer, List<String>> racingCarList);
}
