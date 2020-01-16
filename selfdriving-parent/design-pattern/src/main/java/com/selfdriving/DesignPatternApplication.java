package com.selfdriving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
        System.out.println("Hello World!");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
