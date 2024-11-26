package com.example.Student;
import com.example.Student.Student;

import jakarta.websocket.server.PathParam;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    Map<Long, Student> StudentMap = new HashMap<Long, Student>();
    @GetMapping("/GetAllStudent")
    public Map<Long, Student> getAll(){
        return StudentMap;
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id){
        if(StudentMap.containsKey(id)){
            return StudentMap.get(id);
        }
        return new Student();
    }
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student s1){
        StudentMap.put(s1.getId(), s1);
        System.out.println(s1);
        return StudentMap.get(s1.getId());
    }


     
}
