package com.jonunger.freshspring.domain;

import java.util.List;

/**
 * Content Domain Class
 * Content is defined to have a Header, Touts, and Routes
 *  - Header contains the Headline and Subheadline for the page
 *  - Touts are the informational portions on the page
 *  - Routes are the navigation routes for the application, these can driven based on the slug
 * @author junger8
 * Created by junger on 10/4/2015.
 */
public class Content {

    private Header header;
    private List<Tout> touts;
    private List<String> routes;

    public Content(Header header, List<String> routes, List<Tout> touts){
        this.header = header;
        this.routes = routes;
        this.touts = touts;
    }

    public Header getHeader(){
        return header;
    }

    public List<Tout> getTouts(){
        return touts;
    }

    public List<String> getRoutes(){
        return routes;
    }
}
