package controller;

/**
 * Created by betterFLY on 2018. 4. 7.
 * Github : http://github.com/betterfly88
 */
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String [] args){
        get("/hello",(req, res) ->{
            return "Hello : "+req.queryParams("name")+req.queryParams("age");
        });
    }
}