package dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 3. 9.
 * Github : http://github.com/betterfly88
 */

public enum MOVING_TYPE implements MOVING_TYPE_SERVICE{
    MOVE("-"){
        @Override
        public int additionalMoveCount(){
            return this.moveCnt++;
        }
    },
    STOP(""){
        @Override
        public int additionalMoveCount(){
            return 0;
        }
    };

    final private String type;
    private int moveCnt = 0;

    private MOVING_TYPE(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }


    private static Map<String, MOVING_TYPE> requestMapping;

    static {
        requestMapping = new HashMap<String, MOVING_TYPE>();
        requestMapping.put(MOVE.getType(), MOVE);
        requestMapping.put(STOP.getType(), STOP);
    }

    public static MOVING_TYPE movingCheck(String type) {
        return requestMapping.get(type);
    }
}