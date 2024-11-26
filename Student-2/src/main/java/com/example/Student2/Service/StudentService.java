package com.example.Student2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Student2.Student;


public interface StudentService {
    List<Student> getAllStudent();
    Student getStudent(Long id);
    Student newStudent(Student s1);
    Student updateStudent(Long id, Student s1);
    Boolean deleteStudent(Long id);
} 
