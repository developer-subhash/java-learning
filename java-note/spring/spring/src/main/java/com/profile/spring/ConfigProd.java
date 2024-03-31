package com.profile.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ConfigProd {
    @Value("${name}")
    private String db_username;

    public String getDb_username() {
        return db_username;
    }
}
