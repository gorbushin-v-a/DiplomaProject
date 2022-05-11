package com.example.diplomaproject.config;

import com.example.diplomaproject.handler.GreetingHandler;
import com.example.diplomaproject.service.TestcollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import java.util.Map;

@Configuration
public class GreetingRouter {

    @Autowired
    private TestcollService testcollService;

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        RequestPredicate routeHello = RequestPredicates
                .GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN));

        RequestPredicate routeTable = RequestPredicates.GET("/table");

        return RouterFunctions
                .route(routeHello, greetingHandler::hello)
                .andRoute(routeTable,
                        serverRequest -> {
                            return ServerResponse
                                    .ok()
                                    .render("index", Map.of("testcoll", testcollService.getAll()));
                        }
                );
    }
}
