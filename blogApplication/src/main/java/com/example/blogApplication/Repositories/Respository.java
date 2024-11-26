package com.example.blogApplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogApplication.DAO.BlogDao;

public interface Respository extends JpaRepository<BlogDao, Long>{

    
}
