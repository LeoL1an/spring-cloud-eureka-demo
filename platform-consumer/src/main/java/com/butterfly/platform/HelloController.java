package com.butterfly.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, String name) {
        request.setAttribute("11111111111", request.getRemoteAddr());
        return helloRemote.hello(name);
    }

}
