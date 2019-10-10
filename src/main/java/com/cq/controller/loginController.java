package com.cq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class loginController {

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("home");
       // return "home";
        return mv;
    }
    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        // return "home";

        return mv;
    }

}