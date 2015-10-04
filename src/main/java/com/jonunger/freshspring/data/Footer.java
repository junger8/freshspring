package com.jonunger.freshspring.data;

/**
 * Created by junger on 10/4/2015.
 */
public class Footer {

    private int id;
    private int copyYear;
    private String company;
    private String comment;

    public Footer(int copyYear, String company, String comment){
        this.copyYear = copyYear;
        this.company = company;
        this.comment = comment;
    }

    public int getCopyYear() {
        return copyYear;
    }

    public void setCopyYear(int copyYear) {
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

    public String getFormattedFooter(){
        return getCopyYear()+" "+getCompany()+" "+getComment();
    }


}
