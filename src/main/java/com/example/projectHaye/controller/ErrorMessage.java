package com.example.projectHaye.controller;

public class ErrorMessage {
    private String[] messages;

    public ErrorMessage(String[] messages) {
        this.messages = messages;
    }

    public ErrorMessage(String message) {
        this(new String[]{message});
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }
}
