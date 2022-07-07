package com.chaeking.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/books")
@RestController
public class BookController {

    @GetMapping("")
    public ModelAndView searchPage() {
        ModelAndView mv = new ModelAndView("content/chaeking/book_search");
        mv.addObject("menu_type", "menu_3");
        return mv;
    }
}
