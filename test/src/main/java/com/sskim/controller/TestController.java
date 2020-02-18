package com.sskim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "test1")
    public String tmpl(Model model){
        model.addAttribute("id", 1);
        model.addAttribute("name", "지용호");
        model.addAttribute("nickname","지돌스타");
        model.addAttribute("photo", "images/No.gif");
        return "test1";
    }
}
