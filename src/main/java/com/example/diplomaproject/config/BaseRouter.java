package com.example.diplomaproject.config;

import com.example.diplomaproject.handler.BaseHandler;
import com.example.diplomaproject.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import java.util.Map;

@Configuration
public class BaseRouter {

    @Autowired
    private NoticeService noticeService;

    @Bean
    public RouterFunction<ServerResponse> route(BaseHandler baseHandler) {
        RequestPredicate routeHello = RequestPredicates
                .GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN));

        RequestPredicate routeTable = RequestPredicates.GET("/table");

        return RouterFunctions
                .route(routeHello, baseHandler::hello)
                .andRoute(routeTable,
                        serverRequest -> ServerResponse
                                .ok()
                                .render("table", Map.of("notice", noticeService.getAll()))
                );
    }
}
