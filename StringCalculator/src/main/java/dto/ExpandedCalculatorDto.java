package dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 2. 24.
 * Github : http://github.com/betterfly88
 */

public class ExpandedCalculatorDto {
    public enum Calculate implements Calculator {
        CUSTOM_PLUS(";"){
            @Override
            public double Calculator(double a, double b) {
                return a+b;
            }
        },

        CUSTOM_PLUS_SUB(","){
            @Override
            public double Calculator(double a, double b) {
                return a+b;
            }
        };

        private final String operator;

        Calculate(String operator) {
            this.operator = operator;
        }

        public String getOperator(){
            return this.operator;
        }

        private static Map<String, Calculate> requestMapping;

        static {
            requestMapping = new HashMap<String, Calculate>();
            requestMapping.put(CUSTOM_PLUS.getOperator(), CUSTOM_PLUS);
            requestMapping.put(CUSTOM_PLUS_SUB.getOperator(), CUSTOM_PLUS_SUB);
        }
    }
}
