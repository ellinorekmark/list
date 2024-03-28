package com.example.list.service;

public class AccountMissingException extends Exception {
    public AccountMissingException() {
        super("No account associated with email.");
    }

    public AccountMissingException(String message) {
        super(message);
    }

    public AccountMissingException(String message, Throwable cause) {
        super(message, cause);
    }
}
