package temp;

import handler.CalculatorHandler;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by betterFLY on 2018. 2. 26.
 * Github : http://github.com/betterfly88
 */

public class PracticeRegexMatcherTest {
    PracticeRegexMatcher matcher;

    @Before
    public void setUp(){
        System.out.println("setUp");
        matcher = new PracticeRegexMatcher();
    }

    @Test
    public void Matcher_matches(){
        String text =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";
        String patternString = ".*http://.*";

        //matches
        Assert.assertEquals(true,matcher.getMatcherResult(text,patternString).matches());
    }

    @Test
    public void Matcher_LookingAt(){
        String text =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";
        String patternString = "this is the";

        //matches
        Assert.assertEquals(false,matcher.getMatcherResult(text,patternString).lookingAt());
    }

    @Test
    public void Matcher_LookingAt_Insensitive(){
        String text =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";
        String patternString = "this is the";

        //matches
        Assert.assertEquals(true,matcher.getMatcherInsensitiveResult(text,patternString).lookingAt());
    }

}
