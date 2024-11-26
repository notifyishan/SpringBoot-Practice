package com.example.blogApp.Exception;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//controller advice program me kahi bhi exception handle karte hai
@ControllerAdvice
public class ErrorHander {
    @ExceptionHandler(NoSuchElementException.class)
    public String UserNotFound(NoSuchElementException EX){
        // return "User Not Found";
        return new String("User Not Found");
    }
}
