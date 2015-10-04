package com.jonunger.freshspring.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junger on 10/4/2015.
 */
public class Content {

    private List<Tout> touts;

    public Content(){

        this.touts = setDefaultTouts();

    }

    public List<Tout> getTouts(){
        return touts;
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
