package com.example.blogApp.Exception;

public class ResourceNotFound extends RuntimeException{
    ResourceNotFound(String message){
        super(message);
    }
}