package com.y.authenticationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalkingSkeletonController {
    @GetMapping("/test")
    public String testGetMethod() {
        return "Hello world from authentication-service";
    }
}
