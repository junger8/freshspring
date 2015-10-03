package com.jonunger.freshspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FreshController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Fresh Spring!");
        model.addAttribute("title", "FreshSpring");
        model.addAttribute("header1","Something");
        model.addAttribute("header2","Something Else");
        model.addAttribute("header3","Even More...");
        return "index";
    }
}