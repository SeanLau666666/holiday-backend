package com.tenji.holidayDemo.service;

import com.tenji.holidayDemo.entity.User;

import java.util.List;

public interface UserService {

    User getUserById(int userId);

    List<User> getAllUser();

}
