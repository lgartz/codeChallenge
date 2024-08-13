package com.appgate.codetest.usecase.exceptions;

public class IllegalInputException extends RuntimeException {
    public IllegalInputException(final String message) {
        super(message);
    }
}
