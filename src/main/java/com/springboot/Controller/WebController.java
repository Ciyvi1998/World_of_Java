package com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

    @RequestMapping(value = "/home")
    public static String home(){
        return "home";
    }

    @RequestMapping(value = "/index")
    public static String index(){
        return "index";
    }

    @RequestMapping(value = "/registration")
    public static String registration(){
        return "registerStudent";
    }

}
