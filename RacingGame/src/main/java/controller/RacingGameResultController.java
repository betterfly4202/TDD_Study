package controller;

/**
 * Created by betterFLY on 2018. 3. 25.
 * Github : http://github.com/betterfly88
 */


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class RacingGameResultController {
    public static void main(String [] args){

//        staticFiles.location("/static");
        get("/input", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return render(model, "form.html");
        });

        post("/result",(req, res) ->{
            Map<String, Object> model = new HashMap<>();
            model.put("inputRound", req.queryParams("inputRound"));
            model.put("inputCar", req.queryParams("inputCar"));

            return render(model, "result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}

