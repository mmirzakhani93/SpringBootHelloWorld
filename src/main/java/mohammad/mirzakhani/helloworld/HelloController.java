package mohammad.mirzakhani.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/sayhello")
    public HelloContent sayHello() {
        return new HelloContent("WhatSoft", "Hello, WhatSoft!");
    }
}
