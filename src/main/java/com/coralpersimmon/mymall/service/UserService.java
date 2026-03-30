package com.coralpersimmon.mymall.service;

import com.coralpersimmon.mymall.dto.UserRegisterRequest;
import com.coralpersimmon.mymall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
