package com.profile.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
public class ProjectConfig {

    @Value("${name}")
    private String db_username;

    public String getDb_username() {
        return db_username;
    }
}
