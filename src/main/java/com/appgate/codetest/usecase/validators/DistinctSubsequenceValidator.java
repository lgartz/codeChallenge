package com.appgate.codetest.usecase.validators;

import com.appgate.codetest.domain.DistinctSubsequenceRequestDto;
import com.appgate.codetest.usecase.exceptions.IllegalInputException;

import static java.util.Objects.isNull;

public class DistinctSubsequenceValidator {

    public static void validate(DistinctSubsequenceRequestDto requestDto){
        if(isNull(requestDto))
            throw new IllegalInputException("The request cannot be null");
        if(isNull(requestDto.getS()))
            throw new IllegalInputException("The parameter s (string) cannot be null");
        if(isNull(requestDto.getT()))
            throw new IllegalInputException("The parameter t (subsequence) cannot be null");
    }

}
