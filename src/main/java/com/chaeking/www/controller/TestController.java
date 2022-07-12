package com.chaeking.www.controller;

import com.chaeking.www.domain.value.TokenValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("")
    public ModelAndView loginPageGet(
            @RequestHeader(value = "X-Access-Token", required = false) String accessToken,
            @RequestHeader(value = "X-Refresh-Token", required = false) String refreshToken
    ) {
        ModelAndView mv = new ModelAndView("content/chaeking/home");
        mv.addObject("menu_type", "menu_1");
        return mv;
    }

    @PostMapping("")
    public ModelAndView loginPage(
            TokenValue.Token token
    ) {
        ModelAndView mv = new ModelAndView("content/chaeking/home");
        mv.addObject("menu_type", "menu_1");
        mv.addObject("token", token);
        return mv;
    }

}
