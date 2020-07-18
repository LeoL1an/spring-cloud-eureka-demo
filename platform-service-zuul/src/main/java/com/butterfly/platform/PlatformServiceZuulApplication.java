package com.butterfly.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class PlatformServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformServiceZuulApplication.class, args);
    }

}
