package com.example.blogApp.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogApp.DAO.UserDao;

public interface UserRepo extends JpaRepository<UserDao,Long>{
    
} 
