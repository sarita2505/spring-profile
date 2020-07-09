package com.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SetProfile {
    @Autowired
    private Test1 test1;
    @Autowired
    private Test1 test2;

    @Profile("dev")
    @Bean
    public int getData() {
        return test1.getdata();
    }

    @Profile("qa")
    @Bean
    public int getDataQA() {
        return test2.getdata();
    }


}
