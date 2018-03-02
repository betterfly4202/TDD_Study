package temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by betterFLY on 2018. 2. 26.
 * Github : http://github.com/betterfly88
 */

public class PracticeRegexMatcher {
    private static Pattern pattern;
    private static Matcher matcher;


    public static void main(String[] args){
        String text =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";
        String patternString = ".*http://.*";

        getMatcherResult(text,patternString).matches();

        getMatcherResult(text,patternString).lookingAt();
        getMatcherInsensitiveResult(text,patternString).lookingAt();


        text    =
          "This is the text which is to be searched " +
                  "for occurrences of the word 'is'.";

        patternString = "is";
        int count = 0;
        Matcher m =getMatcherResult(text, patternString);
        while(m.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }


//        // group()
//        text    =
//                "John writes about this, and John writes about that," +
//                        " and John writes about everything. "
//        ;
//
//        String patternString1 = "(John)";
//
//        pattern = Pattern.compile(patternString1);
//        matcher = pattern.matcher(text);
//
//        while(matcher.find()) {
//            System.out.println("found: " + matcher.group(1));
//        }
//
//
//        // multi groups()
//        text    =
//                "John writes about this, and John Doe writes about that," +
//                        " and John Wayne writes about everything."
//        ;
//
//        patternString1 = "(John) (.+?) (.+?) (.*)"; // group(1), group(2), group(3), group(4)
//        pattern = Pattern.compile(patternString1);
//        matcher = pattern.matcher(text);
//
//        String patternString2 = "(John) (.+?)";
//        Pattern pattern2 = Pattern.compile(patternString2);
//        Matcher matcher2 = pattern2.matcher(text);
//
//        while(matcher.find()) {
//            System.out.println("found: " + matcher.group(1) +
//                    " "       + matcher.group(2) + " // "+ matcher.group(3) + " // 4 :"+ matcher.group(3) +
//                    " ======\n "
//                    + matcher2.group(1)+
//                    "> <"       + matcher.group(2) +
//                    "> <"       + matcher.group(3) + ">"
//            );
//        }
//

    }

    public static Matcher getMatcherResult(String text, String patternString){
        pattern = Pattern.compile(patternString);
        matcher = pattern.matcher(text);

        return matcher;
    }

    public static Matcher getMatcherInsensitiveResult(String text, String patternString){
        pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);

        return matcher;
    }
}
