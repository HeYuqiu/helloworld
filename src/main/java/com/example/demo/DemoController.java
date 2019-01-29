package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyuqiu on 2019/1/28.
 */
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo(String name){
        return "hello "+name;
    }
}
