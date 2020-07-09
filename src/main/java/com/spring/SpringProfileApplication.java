package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringProfileApplication {
    public static void main(String[] args) throws Exception {
        // spring.profiles.active=qa,dev
        System.setProperty("spring.profiles.active","qa,dev");
        SpringApplication.run(SpringProfileApplication.class, args);

    }
}
