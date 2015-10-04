package com.jonunger.freshspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FreshController {

    @RequestMapping("/admin")
    public String admin(ModelMap model) {
        model.addAttribute("message", "Fresh Spring Admin!");
        model.addAttribute("title", "FreshSpring - Admin");
        model.addAttribute("header1","Something");
        model.addAttribute("header2","Admin");
        model.addAttribute("header3","Even More...");
        return "index";
    }


    @RequestMapping("/about")
    public String about(ModelMap model) {
        model.addAttribute("message", "About Us");
        model.addAttribute("title", "FreshSpring - About");
        model.addAttribute("header1","Who We are");
        model.addAttribute("header2","What we do");
        model.addAttribute("header3","Even More...");
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(ModelMap model) {
        model.addAttribute("message", "Contact Us");
        model.addAttribute("title", "FreshSpring - Contact");
        model.addAttribute("header1","Find Us");
        model.addAttribute("header2","Call Us");
        model.addAttribute("header3","Even More...");
        return "index";
    }

    @RequestMapping("/home")
    public String home(ModelMap model) {
        model.addAttribute("message", "Fresh Spring!");
        model.addAttribute("title", "FreshSpring - Home");
        model.addAttribute("header1","Something");
        model.addAttribute("header2","Something Else");
        model.addAttribute("header3","Even More...");
        return "index";
    }


    @RequestMapping("*")
    public String notFound(ModelMap model){
        model.addAttribute("title","FreshSpring - Error");
        model.addAttribute("message","Error 404 - Page Not Found!");
        return "404";
    }
}