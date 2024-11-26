package com.example.Student2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student2.Student;
import com.example.Student2.Respository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> s =  studentRepo.findById(id);
        return s.orElseThrow(() -> new IllegalArgumentException("Resourse not found"));
    }

    @Override
    public Student newStudent(Student s1) {
        return studentRepo.save(s1);
    }

    @Override
    public Student updateStudent(Long id, Student s1) {
        Optional<Student> s = studentRepo.findById(id);
        Student response = s.orElseThrow(() -> new IllegalArgumentException("User not created"));
        return studentRepo.save(response);

    }

    @Override
    public Boolean deleteStudent(Long id) {
        Optional<Student> s = studentRepo.findById(id);
        Student s1 = s.orElseThrow(()-> new IllegalAccessException("User Not found"));
        s1.;

    }
    
}
