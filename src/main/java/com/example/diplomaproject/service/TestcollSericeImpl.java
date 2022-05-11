package com.example.diplomaproject.service;

import com.example.diplomaproject.documents.Testcoll;
import com.example.diplomaproject.repository.TestcollRepository;
import lombok.AllArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class TestcollSericeImpl implements TestcollService{

    private TestcollRepository testcollRepository;

    @Override
    public Flux<Testcoll> getAll() {
        return testcollRepository.findAll();
    }

    @Override
    public Mono<Testcoll> getById(String id) {
        return testcollRepository.findById(id);
    }

    @Override
    public Mono<Testcoll> save(Testcoll testcoll) {
        return testcollRepository.save(testcoll);
    }

    @Override
    public Mono<Void> deleteById(String id) { return testcollRepository.deleteById(id); }

}
