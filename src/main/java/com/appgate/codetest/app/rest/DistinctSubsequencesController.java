package com.appgate.codetest.app.rest;

import com.appgate.codetest.domain.DistinctSubsequenceRequestDto;
import com.appgate.codetest.usecase.DistinctSubsequencesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distinct/subsequences")
public class DistinctSubsequencesController {

    @Autowired
    private DistinctSubsequencesUseCase distinctSubsequencesUseCase;

    @PostMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int distinctSubsequences(@RequestBody DistinctSubsequenceRequestDto requestDto) {
        return distinctSubsequencesUseCase.execute(requestDto);
    }
}
