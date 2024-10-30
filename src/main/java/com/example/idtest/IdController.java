package com.example.idtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/api/id")
    public ResponseEntity<String> getId() {
        String id = "56339668130002791";
        return ResponseEntity.ok(id);
    }
}
