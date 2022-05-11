package com.example.diplomaproject.service;

import com.example.diplomaproject.document.Notice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NoticeService {

    Flux<Notice> getAll();
    Mono<Notice> getById(String id);
    Mono<Notice> save(Notice notice);
    Mono<Void> deleteById(String id);
}
