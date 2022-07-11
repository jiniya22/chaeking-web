package com.chaeking.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("")
    public String index() {
        return "content/start/index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "content/start/login";
    }

    @GetMapping("/join")
    public String joinPage() {
        return "content/start/join";
    }

    @ResponseBody
    @GetMapping("/health-check")
    public String healthCheck() {
        return "success";
    }

    @GetMapping("/swagger-ui.html")
    public String temp() {
        return "redirect:/";
    }
}
