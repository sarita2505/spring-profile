package com.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test2 {
@Autowired

    @Value("${y}")
    private int y;
    @GetMapping("/getdataQA")
    //@Profile("qa")
    public int getdataQa(){
        System.out.println("value= "+y);
        return y;
    }

}
