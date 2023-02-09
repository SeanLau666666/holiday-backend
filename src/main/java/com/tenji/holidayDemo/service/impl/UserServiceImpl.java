package com.tenji.holidayDemo.service.impl;

import com.tenji.holidayDemo.dao.UserDao;
import com.tenji.holidayDemo.entity.User;
import com.tenji.holidayDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.findAllUser();
    }
}
