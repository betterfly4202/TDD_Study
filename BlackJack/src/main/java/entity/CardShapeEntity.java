package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 5. 11.
 * Github : http://github.com/betterfly88
 */

public class CardShapeEntity {
    //TODO 보통 Entity라는 객체는 어떨때 쓸까?
    enum CardShape{
        SPADE("S"),
        HEART("H"),
        DIAMOND("D"),
        CLUB("C");

        final private String shape;

        private CardShape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }
    }
}
