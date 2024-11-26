package com.example.Student2.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student2.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

    
} 
