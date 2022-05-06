package com.example.diplomaproject.controller;

import com.example.diplomaproject.documents.Testcoll;
import com.example.diplomaproject.service.TestcollService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/testcoll")
@AllArgsConstructor
public class TestcollController {

    @Autowired
    private TestcollService testcollService;

    @PostMapping
    public Mono<Testcoll> post(@RequestBody Testcoll testcoll) {
        return testcollService.save(testcoll);
    }

    @GetMapping
    public Flux<Testcoll> get() {
        return testcollService.get();
    }
}
