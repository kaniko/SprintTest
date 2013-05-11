package com.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloSpringController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model)
    {
        model.addAttribute("message","Hello this is my first Spring");
        return "output";
    }

}