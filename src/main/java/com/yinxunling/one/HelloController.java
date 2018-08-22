package com.yinxunling.one;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里我们使用RestController
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello (){
        return "hello";
    }
}
