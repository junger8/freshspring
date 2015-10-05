package com.jonunger.freshspring.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junger on 10/4/2015.
 */
public class Content {

    private Header header;
    private List<Tout> touts;
    private List<String> routes;

    public Content(){
        this.header = new Header("test","tester");
        this.routes = setRoutes();
        this.touts = setDefaultTouts();

    }

    public Content(Header header, List<String> routes, List<Tout> toutes){
        this.header = header;
        this.routes = routes;
        this.touts = toutes;

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

    public List<String> setRoutes(){
        List<String> routes = new ArrayList<String>();
        routes.add("About");
        routes.add("Contact");
        routes.add("Admin");
        return routes;
    }

    public List<Tout> setDefaultTouts(){
        Tout testTout = new Tout("Sample1","this is some text","read more");
        Tout testTout2 = new Tout("Sample2","this is some text","read more");
        Tout testTout3 = new Tout("Sample3","this is some text","read more");

        List<Tout> toutList = new ArrayList<Tout>();
        toutList.add(testTout);
        toutList.add(testTout2);
        toutList.add(testTout3);
        return toutList;
    }

}
