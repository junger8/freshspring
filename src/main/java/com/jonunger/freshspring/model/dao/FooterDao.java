package com.jonunger.freshspring.model.dao;

/**
 * Created by junger on 10/4/2015.
 */
public class FooterDao {

    private int id;
    private short copyYear;
    private String company;
    private String comment;

    public short getCopyYear() {
        return copyYear;
    }

    public void setCopyYear(short copyYear) {
        this.copyYear = copyYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



}
