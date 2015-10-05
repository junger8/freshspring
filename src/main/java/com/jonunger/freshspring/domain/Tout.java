package com.jonunger.freshspring.domain;

/**
 * Created by junger on 10/4/2015.
 */
public class Tout {
    private String header;
    private String message;
    private String buttonMessage;

    public Tout(String header, String message, String buttonMessage){
        this.header = header;
        this.message = message;
        this.buttonMessage = buttonMessage;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getButtonMessage() {
        return buttonMessage;
    }

    public void setButtonMessage(String buttonMessage) {
        this.buttonMessage = buttonMessage;
    }


}
