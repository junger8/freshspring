package com.jonunger.freshspring.data;

/**
 * Created by junger on 10/4/2015.
 */
public class Footer {

    private Long copyYear;
    private String company;
    private String comment;

    public Footer(Long copyYear, String company, String comment){
        this.copyYear = copyYear;
        this.company = company;
        this.comment = comment;
    }

    public Long getCopyYear() {
        return copyYear;
    }

    public void setCopyYear(Long copyYear) {
        this.copyYear = copyYear;
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
