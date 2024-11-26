package com.example.blogApp.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.blogApp.DAO.UserDao;
import com.example.blogApp.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
    @Autowired
    UserService userService;
    @GetMapping("/getAllUser")
    public List<UserDao> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/user/{id}")
    public UserDao getMethodName(@PathVariable Long id) {
        return userService.getUserById(id);

    }
    
    
}
