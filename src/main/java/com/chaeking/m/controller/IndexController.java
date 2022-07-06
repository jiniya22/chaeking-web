package com.chaeking.m.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @ResponseBody
    @GetMapping("/health-check")
    public String healthCheck() {
        return "success";
    }

}
