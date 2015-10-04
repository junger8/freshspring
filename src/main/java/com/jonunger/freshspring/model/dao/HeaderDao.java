package com.jonunger.freshspring.model.dao;

/**
 * Created by junger on 10/2/2015.
 */
public class HeaderDao {
    private int id;
    private String slug;
    private String headline;
    private String subheadline;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
