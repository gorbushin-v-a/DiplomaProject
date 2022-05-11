package com.example.diplomaproject.service;

import com.example.diplomaproject.documents.Testcoll;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TestcollService {

    Flux<Testcoll> getAll();
    Mono<Testcoll> getById(String id);
    Mono<Testcoll> save(Testcoll testcoll);
    Mono<Void> deleteById(String id);
}
