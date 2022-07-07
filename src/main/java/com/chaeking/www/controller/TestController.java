package com.chaeking.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("")
    public ModelAndView loginPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/home");
        mv.addObject("menu_type", "menu_1");
        return mv;
    }

}
