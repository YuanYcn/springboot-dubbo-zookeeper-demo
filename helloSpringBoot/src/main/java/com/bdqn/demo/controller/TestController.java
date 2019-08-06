package com.bdqn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("hello2")
    public String index(){
        return "index.html";
    }

    @GetMapping("test1")
    public static String index2(Model model){
        model.addAttribute("aaaa","ssss");
        return "index2.html";
    }
}
