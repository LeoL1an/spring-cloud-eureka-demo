package com.butterfly.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * PlatformEurekaApplication
 *
 * @author LeopoldL1an 2020/6/27
 */
@SpringBootApplication
@EnableEurekaServer
public class PlatformEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformEurekaApplication.class, args);
    }
}
