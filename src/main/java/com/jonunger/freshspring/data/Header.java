package com.jonunger.freshspring.data;

/**
 * Created by junger on 10/4/2015.
 */
public class Header {

    private String slug;
    private String headline;
    private String subheadline;

    public Header(String headline, String subheadline){
        this.headline = headline;
        this.subheadline = subheadline;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSubheadline() {
        return subheadline;
    }

    public void setSubheadline(String subheadline) {
        this.subheadline = subheadline;
    }

}
