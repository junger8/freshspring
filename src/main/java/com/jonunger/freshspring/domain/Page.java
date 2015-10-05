package com.jonunger.freshspring.domain;

/**
 * Page Domain Class
 * @author junger8
 * Created by junger on 10/4/2015.
 */
public class Page {

    private Footer footer;
    private Header header;
    private Content content;

    /**
     * Page Constructor
     * @param header
     * @param content
     * @param footer
     */
    public Page(Header header, Content content, Footer footer){
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public Header getHeader(){
        return header;
    }

    public Content getContent(){
        return content;
    }

    public Footer getFooter(){
        return footer;
    }
}
