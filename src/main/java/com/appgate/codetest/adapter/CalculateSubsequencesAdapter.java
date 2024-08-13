package com.appgate.codetest.adapter;

import com.appgate.codetest.usecase.port.CalculateSubsequencesPort;

public class CalculateSubsequencesAdapter implements CalculateSubsequencesPort {

    @Override
    public Integer calculateQuantitySubsequences(String s, String t) {
        return recursiveCounter(t, "", s, 0);
    }

    private int recursiveCounter(String expected, String concatenated, String rest, Integer quantity){
        if(!expected.startsWith(concatenated))
            return quantity;
        if (concatenated.equals(expected))
            return quantity+1;
        if (concatenated.length() >= expected.length() || (concatenated.length() + rest.length()) < expected.length())
            return quantity;
        for (int i = 0; i < rest.length(); i++) {
            char c = rest.charAt(i);
            String newConcatenated = concatenated + c;
            quantity = recursiveCounter(expected, newConcatenated, rest.substring(i+1), quantity);
        }
        return quantity;
    }



}
