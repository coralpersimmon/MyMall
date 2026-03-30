package com.coralpersimmon.mymall.service.impl;

import com.coralpersimmon.mymall.dao.UserDao;
import com.coralpersimmon.mymall.dto.UserRegisterRequest;
import com.coralpersimmon.mymall.model.User;
import com.coralpersimmon.mymall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
