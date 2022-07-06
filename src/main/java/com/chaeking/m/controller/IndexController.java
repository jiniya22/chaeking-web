package com.chaeking.m.controller;

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
    public String login() {
        return "content/start/login";
    }

    @ResponseBody
    @GetMapping("/health-check")
    public String healthCheck() {
        return "success";
    }

}
