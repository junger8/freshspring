package com.jonunger.freshspring.domain;

/**
 * Footer Domain Class
 * @author junger8
 * Created by junger on 10/4/2015.
 */
public class Footer {

    private Long copyYear;
    private String company;
    private String comment;

    /**
     * Footer Constructor
     * @param copyYear
     * @param company
     * @param comment
     */
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

    /**
     * Formatted Footer to just make life easier
     * @return CopyYear Company Comment
     */
    public String getFormattedFooter(){
        return getCopyYear()+" "+getCompany()+" "+getComment();
    }


}
