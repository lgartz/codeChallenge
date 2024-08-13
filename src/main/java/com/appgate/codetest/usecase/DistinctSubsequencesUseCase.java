package com.appgate.codetest.usecase;

import com.appgate.codetest.domain.DistinctSubsequenceRequestDto;
import com.appgate.codetest.usecase.port.CalculateSubsequencesPort;
import com.appgate.codetest.usecase.validators.DistinctSubsequenceValidator;

public class DistinctSubsequencesUseCase {

    private CalculateSubsequencesPort calculateSubsequencesPort;

    public DistinctSubsequencesUseCase(CalculateSubsequencesPort calculateSubsequencesPort) {
        this.calculateSubsequencesPort = calculateSubsequencesPort;
    }

    public Integer execute(DistinctSubsequenceRequestDto requestDto) {
        DistinctSubsequenceValidator.validate(requestDto);
        if(requestDto.getS().isEmpty())
            return 0;
        if(requestDto.getT().isEmpty())
            return 1;
        return calculateSubsequencesPort.calculateQuantitySubsequences(requestDto.getS(), requestDto.getT());
    }
}
