package com.blackjack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by betterFLY on 2018. 5. 27.
 * Github : http://github.com/betterfly88
 */

@RestController
public class BootController {

    @GetMapping("/main")
    public String index() {
        return "main";
    }
}
