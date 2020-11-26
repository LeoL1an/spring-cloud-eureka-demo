//package com.butterfly.platform;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
//import org.springframework.context.annotation.Bean;
//import reactor.core.publisher.Mono;
//
//@Configurable
//public class RateLimiterConfiguration {
//
//    @Bean
//    public KeyResolver apiKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getPath().value());
//    }
//}
