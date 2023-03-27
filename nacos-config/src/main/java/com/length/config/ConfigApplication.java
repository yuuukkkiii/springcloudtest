package com.length.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext= SpringApplication.run(ConfigApplication.class, args);
        String userName =applicationContext.getEnvironment().getProperty("user.name");
        String userAge =applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("user name: "+userName+" user age: "+userAge);
    }
}
