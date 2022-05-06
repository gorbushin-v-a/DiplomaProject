package com.example.diplomaproject.template;

import com.example.diplomaproject.documents.Testcoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.ReactiveRemoveOperation;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class testcollTemplateOperations {
    @Autowired
    ReactiveMongoTemplate template;

    public Mono<Testcoll> findById(String id) {
        return template.findById(id, Testcoll.class);
    }

    public Flux<Testcoll> findAll() {
        return template.findAll(Testcoll.class);
    }

    public Mono<Testcoll> save(Mono<Testcoll> account) {
        return template.save(account);
    }

    public ReactiveRemoveOperation.ReactiveRemove<Testcoll> deleteAll() {
        return template.remove(Testcoll.class);
    }
}
