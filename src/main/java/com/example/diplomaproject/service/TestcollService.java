package com.example.diplomaproject.service;

import com.example.diplomaproject.documents.Testcoll;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TestcollService {

    Flux<Testcoll> get();
    Mono<Testcoll> save(Testcoll testcoll);
}
