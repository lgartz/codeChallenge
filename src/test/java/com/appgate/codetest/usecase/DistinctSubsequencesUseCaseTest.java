package com.appgate.codetest.usecase;

import com.appgate.codetest.domain.DistinctSubsequenceRequestDto;
import com.appgate.codetest.usecase.exceptions.IlegalInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("UseCase - Distinct Subsequences")
public class DistinctSubsequencesUseCaseTest {

    private final DistinctSubsequencesUseCase distinctSubsequencesUseCase = new DistinctSubsequencesUseCase();

    @Test
    void givenANullStringThenReturnAnException(){
        Assertions.assertThrows(IlegalInputException.class, () -> distinctSubsequencesUseCase.execute(createRequest(null, "a")));
    }

    @Test
    void givenANullSubsequenceThenReturnAnException(){
        Assertions.assertThrows(IlegalInputException.class, () -> distinctSubsequencesUseCase.execute(createRequest("a", null)));
    }

    @Test
    void givenACorrectStringAndSequenceReturnTheAmount(){
        Integer quantity = distinctSubsequencesUseCase.execute(createRequest("rabbbit", "rabbit"));
        Assertions.assertEquals(3, quantity);
        quantity = distinctSubsequencesUseCase.execute(createRequest("babgbag", "bag"));
        Assertions.assertEquals(5, quantity);
    }

    @Test
    void givenACorrectStringAndEmptySequenceReturnTheAmount(){
        Integer quantity = distinctSubsequencesUseCase.execute(createRequest("rabbbit", ""));
        Assertions.assertEquals(1, quantity);

    }

    @Test
    void givenAEmptyStringAndCorrectSequenceReturnTheAmount(){
        Integer quantity = distinctSubsequencesUseCase.execute(createRequest("babgbag", ""));
        Assertions.assertEquals(0, quantity);
    }

    private DistinctSubsequenceRequestDto createRequest(String s, String t){
        return new DistinctSubsequenceRequestDto (s, t);
    }

}
