package com.example.listig.exceptions;

public class UserCreationException extends Exception {
    public UserCreationException() {
        super("Email already exists.");
    }

    public UserCreationException(String message) {
        super(message);
    }

    public UserCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
