package com.xyy.service;

import com.xyy.domain.User;

public interface UserService {
    boolean addUser(User user);
    User getByUserName(String userName);
    User getByUser(User user);
    User getById(int id);
}
