package com.tenji.holidayDemo.controller;

import com.tenji.holidayDemo.entity.User;
import com.tenji.holidayDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public List<User> getAllUser(Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return userList;
    }

}
