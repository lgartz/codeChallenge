package com.appgate.codetest.usecase.validators;

import java.util.Objects;

public class InputValidator {

    public static boolean isValid(String value){
        return !Objects.requireNonNullElse(value, "").isEmpty();
    }

}
