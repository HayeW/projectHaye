package com.example.projectHaye.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@ResponseBody
@CrossOrigin(origins = "*")
public class ExceptionHandling {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public String exceptionHandler(Exception ex) {
        return ex.getMessage();
    }

    // HOI HAYE HIERBOVEN MOET EEN RESPONSEENTITY ALS RETURN TYPE
}
