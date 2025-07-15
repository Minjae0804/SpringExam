package com.minjae.demo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String index() {
        return "안녕하세요! 스프링부트입니다!";
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("안녕하세요, %s님!", name));
    }

    @PostMapping("/greeting")
    public Greeting greetingPost(@RequestBody GreetingRequest request) {
        return new Greeting(counter.incrementAndGet(), "POST로 받은 이름: " + request.getName());
    }
}
