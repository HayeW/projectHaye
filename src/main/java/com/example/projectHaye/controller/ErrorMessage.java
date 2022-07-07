package com.example.projectHaye.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {
    private String[] messages;

    public ErrorMessage(String[] messages) {
        this.messages = messages;
    }

    public ErrorMessage(String message) {
        this(new String[]{message});
    }
}
