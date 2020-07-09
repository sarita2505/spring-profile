package com.spring.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
@Configuration
public class ActiveProfile implements WebApplicationInitializer {
    public ActiveProfile() {
        System.out.println("=================default profile============================");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.active","dev");
    }
}
