package com.example.list.exceptions;

public class EmailExistsException extends Exception {
    public EmailExistsException() {
        super("Email already exists.");
    }

    public EmailExistsException(String message) {
        super(message);
    }

    public EmailExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
