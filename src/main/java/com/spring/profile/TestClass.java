package com.spring.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {
    @Value("${x}")
    private int x;
    @GetMapping("/get")
    private void getData(){
        System.out.println("value is "+x);
    }
}
