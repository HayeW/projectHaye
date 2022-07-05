package com.example.projectHaye.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;

@ControllerAdvice
@ResponseBody
@CrossOrigin(origins = "*")
public class ExceptionHandling {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorMessage exceptionHandler(Exception ex) {
        return new ErrorMessage(ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
        public ErrorMessage exceptionHandler(MethodArgumentNotValidException ex) {
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();

        String[] messages = new String[allErrors.size()];
        for (int i = 0; i < allErrors.size(); i++){
            messages[i] = allErrors.get(i).getDefaultMessage();
        }
        return new ErrorMessage(messages);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ErrorMessage exceptionHandler(ConstraintViolationException ex) {
        String msg = ex
                .getConstraintViolations()
                .stream()
                .findFirst()
                .get()
                .getMessage();
        return new ErrorMessage(msg);
    }
}
