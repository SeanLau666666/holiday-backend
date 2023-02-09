package com.tenji.holidayDemo.dao;

import com.tenji.holidayDemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    User findUserById(int userId);

    List<User> findAllUser();

}
