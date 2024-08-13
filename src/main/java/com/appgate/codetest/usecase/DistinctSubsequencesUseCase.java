package com.appgate.codetest.usecase;

import com.appgate.codetest.domain.DistinctSubsequenceRequestDto;
import com.appgate.codetest.usecase.validators.DistinctSubsequenceValidator;

public class DistinctSubsequencesUseCase {

    public Integer execute(DistinctSubsequenceRequestDto requestDto) {
        DistinctSubsequenceValidator.validate(requestDto);
        if(requestDto.getS().isEmpty())
            return 0;
        if(requestDto.getT().isEmpty())
            return 1;
        // TODO implementar algoritmo de busqueda de subsecuencias

        // TODO retornar el numero de subsecuencias distintas encontradas
        return null;
    }
}
