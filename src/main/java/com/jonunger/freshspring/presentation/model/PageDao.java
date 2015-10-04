package com.jonunger.freshspring.presentation.model;

import com.jonunger.freshspring.data.Content;
import com.jonunger.freshspring.data.Footer;
import com.jonunger.freshspring.data.Header;
import com.jonunger.freshspring.data.Page;

/**
 * Created by junger on 10/4/2015.
 */
public class PageDao {

    private Page page;

    public PageDao(){

    }

    //TODO create page
    public PageDao(String slug){
        //Hard coding out to build out logic
        Header header = new Header("FreshSpring "+slug, "Find some "+slug+" in here");
        Footer footer = new Footer(2015,"TESTer","All Rights Reserved");
        Content content = new Content();

        this.page = new Page(header, content, footer);
    }

    //Get Page Based on given slug
    public Page getPage(){
        return page;
    }



}
