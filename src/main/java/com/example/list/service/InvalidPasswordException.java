package com.example.list.service;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        super("Password is incorrect.");
    }

    public InvalidPasswordException(String message) {
        super(message);
    }

    public InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
