package com.example.demo.exception;

public class NotBookCodeException extends Exception{
    @Override
    public String getMessage() {
        return "Your code is invalid";
    }
}
