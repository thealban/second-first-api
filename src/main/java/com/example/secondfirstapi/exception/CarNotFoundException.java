package com.example.secondfirstapi.exception;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(String msg) {
        super(msg);
    }
}
