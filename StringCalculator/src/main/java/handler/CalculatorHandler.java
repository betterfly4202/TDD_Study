package handler;

import common.Utils;
import dto.CalculatorDto;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

/**
 * Created by betterFLY on 2018. 2. 22.
 * Github : http://github.com/betterfly88
 */

public class CalculatorHandler{
    // 중간 연산
    public static double invokeCalculator(String operator, double a, double b) {
        CalculatorDto.Calculate operation = CalculatorDto.Calculate.operatorCheck(operator);
        return operation.Calculator(a,b);
    }

    // 최종 연산
    public static double resultCalculator (String inputValue){
        CalculatorDto.Calculate calcuate = null;

        CalculatorHandler calHandler = new CalculatorHandler();
        ArrayList<String> splitGetValueList = Utils.splitValue(inputValue);

        //배열에 수식이 있는 경우 [-1 0 +1]  이기 때문에, 0 기준 [-1 연산 +1]
        double result = parseDouble(splitGetValueList.get(0));
        for(int i=0; i<splitGetValueList.size(); i++){
            if(calcuate.matchingExpression(splitGetValueList.get(i)))
                result = calHandler.invokeCalculator(
                        splitGetValueList.get(i)
                        ,result
                        ,parseDouble(splitGetValueList.get(i+1)));
        }
        return result;
    }


}