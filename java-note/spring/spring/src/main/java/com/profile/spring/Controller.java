package com.profile.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Value("${name}")
    private String db_username;

    @Autowired
    ProjectConfig p;

//    @Autowired
//    ConfigDev c;

//    @Autowired
//    ConfigProd pr;

    @GetMapping("/")
    public Book getBook(){
        System.out.println("db's username from controller file " + db_username);
//        ProjectConfig p = new ProjectConfig();
        System.out.println("db's username from simple class file " + p.getDb_username());
//        System.out.println("db's username from configdev class file " + c.getDb_username());
//        System.out.println("db's username from configprod class file " + pr.getDb_username());

        return new Book(16, "subh");
    }
}
