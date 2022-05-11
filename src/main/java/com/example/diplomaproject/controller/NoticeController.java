package com.example.diplomaproject.controller;

import com.example.diplomaproject.document.Notice;
import com.example.diplomaproject.service.NoticeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/notice")
@AllArgsConstructor
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @PostMapping
    public Mono<Notice> post(@RequestBody Notice notice) {
        return noticeService.save(notice);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@RequestParam(value="id") String id) { return noticeService.deleteById(id); }

    @GetMapping
    public Flux<Notice> getAll() {
        return noticeService.getAll();
    }
}
