package com.xyy.service.impl;

import com.xyy.domain.User;
import com.xyy.mapper.UserMapper;
import com.xyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2025/5/18 22:51
 * 向远洋
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean addUser(User user) {
        userMapper.add(user);
        return true;
    }

    @Override
    public User getByUserName(String userName) {
        return userMapper.getByName(userName);
    }
    @Override
    public User getByUser(User user) {
        return userMapper.getByUser(user);
    }
    @Override
    public User getById(int id) {
        return userMapper.getById(id);
    }
}
