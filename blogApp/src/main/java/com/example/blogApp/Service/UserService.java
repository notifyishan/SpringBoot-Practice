package com.example.blogApp.Service;

import java.util.List;

import com.example.blogApp.DAO.UserDao;

public interface UserService {
    List<UserDao> getAllUser();
    UserDao getUserById(Long id);
    UserDao createUser();


} 
