package com.example.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("/demo")
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/time")
    public ResponseEntity<String> demo(){
        String currentTime = new Date().toString();
        return ResponseEntity.ok().body(currentTime);
    }

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok().body("Test");
    }
}
