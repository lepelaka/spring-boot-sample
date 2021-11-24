package net.lepelaka.boot.springboot.web;

import net.lepelaka.boot.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(String name, int amount) {
        return new HelloResponseDto(name, amount);
    }
    @GetMapping("/hello/dto2")
    public HelloResponseDto helloDto2(HelloResponseDto dto) {
        return dto;
    }
}
