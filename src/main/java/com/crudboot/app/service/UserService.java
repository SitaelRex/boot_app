package com.crudboot.app.service;


import com.crudboot.app.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(long id);

    User getUser(long id);

    List<User> getUsersList();

    void updateUser(long id, User user);
}
