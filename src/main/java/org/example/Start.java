package org.example;

import org.example.web.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Start {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AppConfig.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
