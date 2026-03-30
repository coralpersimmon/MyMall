package com.coralpersimmon.mymall.dao;

import com.coralpersimmon.mymall.dto.UserRegisterRequest;
import com.coralpersimmon.mymall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
