package com.appgate.codetest.app.config;

import com.appgate.codetest.adapter.CalculateSubsequencesAdapter;
import com.appgate.codetest.usecase.DistinctSubsequencesUseCase;
import com.appgate.codetest.usecase.port.CalculateSubsequencesPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CalculateSubsequencesPort calculateSubsequencesPort(){
        return new CalculateSubsequencesAdapter();
    }

    @Bean
    public DistinctSubsequencesUseCase distinctSubsequencesUseCase(){
        return new DistinctSubsequencesUseCase(calculateSubsequencesPort());
    }
}
