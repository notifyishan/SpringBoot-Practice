package com.example.Student.Service;

import java.util.List;
import java.util.Optional;

import com.example.Student.Student;

public interface StudentService {
    List<Student> getAllStudent();
    Student addStudent(Student s1);
    Optional<Student> findById(Long id);
    Optional<Student> updateStudent(Long id, Student s1);
    boolean deleteStudent(Long id);
    boolean checkId(Long id);   
} 
