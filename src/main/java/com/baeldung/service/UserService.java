package com.baeldung.service;

import java.util.List;

import com.baeldung.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
