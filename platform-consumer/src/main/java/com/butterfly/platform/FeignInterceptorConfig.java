package com.butterfly.platform;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FeignInterceptorConfig
 *
 * @author LeopoldL1an 2020/7/2
 */
@Configuration
public class FeignInterceptorConfig {

    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        RequestInterceptor requestInterceptor = template -> {
            template.header("traceId", "111");
        };
        return requestInterceptor;
    }

    @Bean
    Logger FeignLog() {
        return new FeignLogger();
    }
}