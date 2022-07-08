package com.chaeking.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/setting")
@RestController
public class SettingController {

    @GetMapping("/main")
    public ModelAndView settingMainPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/setting_main");
        mv.addObject("menu_type", "menu_4");
        return mv;
    }
}
