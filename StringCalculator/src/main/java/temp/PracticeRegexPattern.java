package temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by betterFLY on 2018. 2. 26.
 * Github : http://github.com/betterfly88
 */

public class PracticeRegexPattern {

    public static void main(String [] args){
        String [] a = split("alw,112*5//;\n1;3;4");
        for(String aa : a ){
            System.out.println(aa);
        }

        String text    =
                "This is the text to be searched " +
                        "for occurrences of the pattern.";
        String patterns = ".*is.*";
        boolean matches = Pattern.matches(patterns, text);
        System.out.println("matches = " + matches);


        text =   "This is the text to be searched " +
                "for occurrences of the http:// pattern.";
        String patternString = ".*http://.*";
        Pattern patternss = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher m = patternss.matcher(text);
        System.out.println(m);
        System.out.println(m.matches());


        text = "A sep Text sep With sep Many sep Separators";

        patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);

        String[] split = pattern.split(text);

        System.out.println("split.length = " + split.length);

        for(String element : split){
            System.out.println("element = " + element);
        }

        /*
            In this example the pattern2 variable will contain the value sep, which was the value the Pattern instance was compiled from.
         */
        patternString = "sep";
        pattern = Pattern.compile(patternString);

        String pattern2 = pattern.pattern();
        System.out.println("pattern2 : "+pattern2);

    }

    public static String[] split(String str) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
//        if (m.find()) {
        if (m.matches()) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }

        return str.split(",|;");
    }
}
