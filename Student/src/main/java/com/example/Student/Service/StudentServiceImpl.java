package com.example.Student.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.Student.Student;
import com.example.Student.StudentRepo;
// import com.example.Student.service.StudentService;
import com.example.Student.Service.StudentService;
// import com.example.Student.Student;
@Service
public class StudentServiceImpl implements StudentService {
    StudentServiceImpl(){
        System.out.println("Hello");
    }
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
    @Override
    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }
    @Override
    public Student addStudent(Student s1) {
        studentRepo.save(s1);
        return s1;
    }
    @Override
    public Student updateStudent(Long id, Student s1) {
        Student student =  studentRepo.findById(id).thr;
        return s1;
    }
    @Override
    public boolean deleteStudent(Long id) {
        StudentMap.remove(id);
        return true;
    }
    @Override
    public boolean checkId(Long id) {
        if(StudentMap.containsKey(id)) return true;
        else return false;
    }


}
