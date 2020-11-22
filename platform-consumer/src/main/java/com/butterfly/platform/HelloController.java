package com.butterfly.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * HelloController
 *
 * @author LeopoldL1an 2020/6/28
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello1")
    public String hello1(String name) {
        return helloRemote.hello1(name);
    }

    @GetMapping("/hello2")
    public String hello2(String name) {
        return helloRemote.hello2(name);
    }

    @PostMapping("/hello3")
    public String hello3(String name) {
        return helloRemote.hello1(name);
    }

}
