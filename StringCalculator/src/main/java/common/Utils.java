package common;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by betterFLY on 2018. 2. 24.
 * Github : http://github.com/betterfly88
 */

public class Utils {
    // Stirng -> Double 파싱
    public static double parseDouble(String tempString){
        return Double.parseDouble(tempString);
    }

    // 문자열 쪼개기
    public static ArrayList<String> splitValue(String value){
        String [] tempArray = value.split(" ");

        ArrayList arrStr = new ArrayList<String>();
        for(String temp : tempArray){
            arrStr.add(temp);
        }
        return arrStr;
    }


    // 정규표현식 문자열 쪼개기
    public static String [] fromRegexGetSplitValue(String inputValue){
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(inputValue);

        if(matcher.find()){
            String customDelimeter = matcher.group(1);
            return matcher.group(2).split(customDelimeter);
        }

        return inputValue.split(",|;");
    }

    // 문자열 쪼갠 후 연산 처리하기

}
