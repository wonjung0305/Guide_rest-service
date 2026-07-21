package com.example.restservice;

/**
 * 클라이언트에게 전달할 응답 데이터의 구조를 정의하는 DTO 클래스
 *  데이터만 담아두는 역할
 * @param id
 * @param content
 */
public record Greeting(long id, String content){}
