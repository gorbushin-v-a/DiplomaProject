package com.example.diplomaproject.handler;

import com.example.diplomaproject.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class BaseHandler {

    @Autowired
    private NoticeService noticeService;

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse
                .ok()
                .render("hello", Map.of("notice", "noticeService.getAll())"));
    }

    public Mono<ServerResponse> table(ServerRequest request) {
        return ServerResponse
                .ok()
                .render("table", Map.of("notice", noticeService.getAll()));
    }
}
