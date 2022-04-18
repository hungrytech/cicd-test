package com.teak.cicdtestapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("OKOK BUILD COMPLETE!! PLEASE..");
    }

    @GetMapping("/test")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("테스트 API slack message slackccccccdfdc");
    }
}
