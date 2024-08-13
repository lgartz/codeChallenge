package com.appgate.codetest.usecase.exceptions;

public class IlegalInputException extends RuntimeException {
    public IlegalInputException(final String message) {
        super(message);
    }
}
