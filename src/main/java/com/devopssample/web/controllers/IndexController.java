package com.devopssample.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by katherine_celeste on 12/2/16.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
