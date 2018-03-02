package handler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by betterFLY on 2018. 2. 26.
 * Github : http://github.com/betterfly88
 */

public class ExpandedCalculatorHandler {

    public static void main(String [] args){
        String TEST_STRING ="//;\n";
        Pattern pattern = Pattern.compile("//;\n");

        Matcher matcher = pattern.matcher(TEST_STRING);

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        System.out.println(matcher.replaceAll(""));

        String [] a = split("//;\n1;3;4");
        for(String aa : a ){
            System.out.println(aa);
        }

    }

    public static String[] split(String str) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        if (m.find()) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }

        return str.split(",|;");
    }
}
