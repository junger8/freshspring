package com.jonunger.freshspring.service;

/**
 * Created by junger on 10/2/2015.
 */
public class PageService extends AbstractService {

    public PageService(){
    }

    //Get default page
    public String getPage(String slug){
        return slug;
    }

    public String getFooter(){
        return "something";
    }
}
