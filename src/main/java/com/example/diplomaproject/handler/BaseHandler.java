package com.example.diplomaproject.handler;

import org.springframework.http.MediaType;
import org.springframework.http.ReactiveHttpOutputMessage;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class BaseHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        BodyInserter<String, ReactiveHttpOutputMessage> body =
                BodyInserters.fromValue("Hello, Spring!");

        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(body);
    }
}