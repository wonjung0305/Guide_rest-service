package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    // RequestParam 쿼리 스트링의 name 파라미터 값을 greeting() 메서드의 name 매개변수에 바인딩(연결)
    @GetMapping("/greeting") // greeting이라는 http 요청 -> greeting 메서드로 매핑되도록
    public Greeting greeting(@RequestParam(defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), template.formatted(name));
    }
}
