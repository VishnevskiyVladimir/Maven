package com.practice.service;

import com.practice.database.dao.UserDao;
import com.practice.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}