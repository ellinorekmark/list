package com.example.list.exceptions;

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
