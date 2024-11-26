package com.example.blogApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blogApp.DAO.UserDao;
import com.example.blogApp.Respositories.UserRepo;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;
    @Override
    public List<UserDao> getAllUser() {
        return userRepo.findAll();
    }
    @Override
    public UserDao getUserById(Long id) {
        return userRepo.findById(id).orElseThrow();
    }

    @Override
    public UserDao createUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }
    
}
