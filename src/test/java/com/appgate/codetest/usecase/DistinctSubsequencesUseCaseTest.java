package com.appgate.codetest.usecase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("UseCase - Distinct Subsequences")
public class DistinctSubsequencesUseCaseTest {

    private final DistinctSubsequencesUseCase distinctSubsequencesUseCase = new DistinctSubsequencesUseCase();

    @Test
    void givenANullStringThenReturnAnException(){
        //TODO: Implement this test
    }

    @Test
    void givenANullSubsequenceThenReturnAnException(){
        //TODO: Implement this test
    }

    @Test
    void givenACorrectStringAndSequenceReturnTheAmount(){
        //TODO: Implement this test
    }

    @Test
    void givenACorrectStringAndEmptySequenceReturnTheAmount(){
        //TODO: Implement this test
    }

    @Test
    void givenAEmptyStringAndCorrectSequenceReturnTheAmount(){
        //TODO: Implement this test
    }

}
