package com.example.demo.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplate {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
