package com.butterfly.platform;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloRemote
 *
 * @author LeopoldL1an 2020/6/28
 */
@FeignClient(name = "platform-provider", fallback = HelloFallbackService.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    String hello2(@RequestParam("name") String name);
}
