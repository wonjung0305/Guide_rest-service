package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 애플리케이션을 시작하고 필요한 설정들을 자동으로 구성하는 구동 클래스
 */
@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
