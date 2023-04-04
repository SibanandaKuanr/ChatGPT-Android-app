package com.app.chatgpt;

public class Message {

    public static String SEND_BY_ME = "me";
    public static String SEND_BY_BOT = "bot";

    String message;
    String sentBy;

    public Message(String message, String sentBy) {
        this.message = message;
        this.sentBy = sentBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
} // Message End Here =========
