package com.contactmanager.contactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

@RequestMapping("/home")
    public String home()
    {
    System.out.println("Hello");
        return "home";

    }

    //about 
   
   @RequestMapping("/about")
    public String aboutPage()
    {
        System.out.println("Hello About");
        return "about";

    }

}
