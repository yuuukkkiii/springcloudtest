package com.length.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext= SpringApplication.run(ConfigApplication.class, args);
        while(true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            String config = applicationContext.getEnvironment().getProperty("user.config");
            String area = applicationContext.getEnvironment().getProperty("user.area");
            System.out.println("user name: " + userName + " user age: " + userAge+" user config: "+config);
            System.out.println("user area:  "+area);
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
