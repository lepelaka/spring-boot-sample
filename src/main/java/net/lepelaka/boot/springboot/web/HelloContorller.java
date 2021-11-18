package net.lepelaka.boot.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
