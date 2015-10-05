package com.jonunger.freshspring.controller;

import com.jonunger.freshspring.domain.Page;
import com.jonunger.freshspring.service.PageService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Fresh Controller
 * This is the main controller for the application
 * @author junger8
 */
@Controller
public class FreshController {

    Logger logger = LogManager.getLogger();

    /**
     * Router
     * @param model
     * @param slug
     * @return view
     */
    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public String router(ModelMap model, @PathVariable("id") String slug) {

        if(logger.isDebugEnabled()){
            logger.debug("Requested Route: /"+slug);
        }

        PageService pageService = new PageService(slug);
        Page page = pageService.getPage();
        model.addAttribute("headline", page.getContent().getHeader().getHeadline());
        model.addAttribute("subheadline", page.getContent().getHeader().getSubheadline());
        model.addAttribute("title", "FreshSpring - "+slug);
        model.addAttribute("footer",page.getFooter().getFormattedFooter());
        model.addAttribute("toutList",page.getContent().getTouts());
        model.addAttribute("routes",page.getContent().getRoutes());
        return "index";
    }


}