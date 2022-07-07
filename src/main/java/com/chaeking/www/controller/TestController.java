package com.chaeking.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    @GetMapping("")
    public String loginPage() {
        return "content/chaeking/home";
    }

}
