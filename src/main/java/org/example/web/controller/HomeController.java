package org.example.web.controller;

import org.example.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    User user;

    @RequestMapping("/")
    public String index() {

        return "hello world:" + user.getName() + "-" + user.getAge();
    }

}
