package com.appgate.codetest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DistinctSubsequenceRequestDto {
    private String s;
    private String t;
}
