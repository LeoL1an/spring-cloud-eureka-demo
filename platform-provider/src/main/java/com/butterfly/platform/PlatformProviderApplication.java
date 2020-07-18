package com.butterfly.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlatformProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformProviderApplication.class, args);
    }

}
