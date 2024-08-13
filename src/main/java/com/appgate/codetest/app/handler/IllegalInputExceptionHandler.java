package com.appgate.codetest.app.handler;

import com.appgate.codetest.domain.ErrorResponseDto;
import com.appgate.codetest.usecase.exceptions.IllegalInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IllegalInputExceptionHandler {

    @ExceptionHandler(IllegalInputException.class)
    public ResponseEntity<ErrorResponseDto> handleException(IllegalInputException ex) {
        ErrorResponseDto errorResponse = new ErrorResponseDto(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
