package com.jonunger.freshspring.presentation.controller;

import com.jonunger.freshspring.data.Page;
import com.jonunger.freshspring.presentation.model.PageDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FreshController {

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public String router(ModelMap model, @PathVariable("id") String slug) {
        PageDao pageDao = new PageDao(slug);
        Page page = pageDao.getPage();
        model.addAttribute("headline", page.getHeader().getHeadline());
        model.addAttribute("subheadline", page.getHeader().getSubheadline());
        model.addAttribute("title", "FreshSpring - "+slug);
        model.addAttribute("footer",page.getFooter().getFormattedFooter());
        model.addAttribute("toutList",page.getContent().getTouts());
        return "index";
    }

    @RequestMapping("*")
    public String notFound(ModelMap model){
        model.addAttribute("title","FreshSpring - Error");
        model.addAttribute("message","Error 404 - Page Not Found!");
        return "404";
    }
}