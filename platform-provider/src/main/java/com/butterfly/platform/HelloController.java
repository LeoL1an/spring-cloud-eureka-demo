package com.butterfly.platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * TestController
 *
 * @author LeopoldL1an 2020/6/28
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello1")
    public String hello1(HttpServletRequest request, String name) {
        logger.info("接收到来自[{}]的请求:{}", request.getRemoteAddr(), name);
        return "hello " + name + "!";
    }
    @GetMapping("/hello2")
    public String hello2(HttpServletRequest request, String name) {
        logger.info("接收到来自[{}]的请求:{}", request.getRemoteAddr(), name);
        return "hello2 " + name + "!";
    }
}
