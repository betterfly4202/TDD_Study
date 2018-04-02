package dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */

public enum MOVING_TYPE{
    MOVE("-"),
    STOP("");

    final private String type;

    private MOVING_TYPE(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

}