package com.baeldung.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.model.User;

@RestController
public class UserController {

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listUser(){
        return getUsers();
    }

    private List<User> getUsers() {
        User steve = new User(1L, "steve", 40);
        User charlie = new User(2L, "charlie", 35);
        User lisa  = new User(3L, "lisa", 28);
        return Arrays.asList(steve, charlie, lisa);
    }
}
