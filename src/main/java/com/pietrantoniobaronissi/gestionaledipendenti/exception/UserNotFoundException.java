package com.pietrantoniobaronissi.gestionaledipendenti.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
