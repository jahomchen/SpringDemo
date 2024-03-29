package org.example;

import org.example.web.AppConfig;
import org.example.web.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Start {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AppConfig.class, args);

        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("====================================================");

        User bean = run.getBean(User.class);
        System.out.println(bean.getName());
    }
}
