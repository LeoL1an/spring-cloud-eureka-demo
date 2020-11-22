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
    public String hello1(@RequestParam("name") String name) {
        return "服务降级1";
    }
    @Override
    public String hello2(@RequestParam("name") String name) {
        return "服务降级2";
    }

}
