
package OOP.review;

import java.util.HashMap;

/**
 * Created by betterFLY on 2018. 3. 1.
 * Github : http://github.com/betterfly88
 */

public class OperatorOuter{

    public OperatorOuter() {
        HashMap<String, Operator>hm = new HashMap<>();
        OperatorMap opMap = new OperatorMap();
        opMap.Add(hm, new Plus());
        opMap.Add(hm, new Minus());
        opMap.Add(hm, new Multiply());
        opMap.Add(hm, new Divider());
    }

    public class Divider implements  Operator{
        private String key = "/";

        @Override
        public int operate(int number1, int number2) {
            return number1 / number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public class Minus implements Operator{
        private final String key = "-";

        @Override
        public int operate(int number1, int number2) {
            return number1 - number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public class Multiply implements  Operator{

        private final String key = "*";

        public String getKey(){
            return key;
        }

        @Override
        public int operate(int number1, int number2) {
            return number1 * number2;
        }
    }

    public class Plus implements Operator {
        private final String key = "+";

        @Override
        public int operate(int number1, int number2) {
            return number1 + number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

}
