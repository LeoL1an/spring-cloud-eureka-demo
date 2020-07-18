package com.butterfly.platform;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloFallbackService
 *
 * @author LeopoldL1an 2020/6/29
 */
@Component
public class HelloFallbackService implements HelloRemote{
    @Override
    public String hello(@RequestParam("name") String name) {
        return "服务降级";
    }

}
