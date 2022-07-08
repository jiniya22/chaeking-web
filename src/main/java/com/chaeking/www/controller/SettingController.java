package com.chaeking.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/setting")
@RestController
public class SettingController {

    static String menuType = "menu_4";

    @GetMapping("/main")
    public ModelAndView settingMainPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/setting/main");
        mv.addObject("menu_type", menuType);
        return mv;
    }

    @GetMapping("/system")
    public ModelAndView settingSystemPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/setting/system");
        mv.addObject("menu_type", menuType);
        return mv;
    }

    @GetMapping("/user")
    public ModelAndView settingUserPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/setting/user");
        mv.addObject("menu_type", menuType);
        return mv;
    }
}
