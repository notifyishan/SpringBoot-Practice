package com.example.ShopKart.Service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.ShopKart.Model.User;

public interface UserService {
    Map<Long , User> getAllUser();
    User getUser(Long id);
    User addUser(User u1);
    User updateUser(Long id, User u1);
    Boolean deletUser(Long id);
    Boolean checkUser(Long id);
    
    
} 
