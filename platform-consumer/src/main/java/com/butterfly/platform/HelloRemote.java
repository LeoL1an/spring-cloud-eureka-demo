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
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
