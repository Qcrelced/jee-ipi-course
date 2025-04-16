package com.declercq.messagie.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    //@Qualifier("blabla")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
