package blackjack.entity;

/**
 * Created by betterFLY on 2018. 5. 11.
 * Github : http://github.com/betterfly88
 */

public enum CardShapeEntity {
    //TODO 보통 Entity라는 객체는 어떨때 쓸까?

    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");

    final private String shape;

    CardShapeEntity(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
