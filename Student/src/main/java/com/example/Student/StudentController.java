package com.example.Student;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import com.example.Student.Service.*;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @Controller (all types of requests are handled)
// @RestController (only //REST requests are handled)
@RestController 
public class StudentController {
    //@component when custom defined
    //@beam predine
    // Map<Long, Student> StudentMap = new HashMap<Long, Student>();

    //autowire it helps to call object from main file(beam inject)
    @Autowired 
    private StudentService studentService;
    // public StudentController(StudentService studentService) {
    //     this.studentService = studentService;
    // }
    @GetMapping("/GetAllStudent")
    public Map<Long, Student> getAll(){
        return studentService.getAllStudent();
    }
    @GetMapping("/Student")
    public ResponseEntity<?> GetStudent(@RequestParam Long id){
        if(!studentService.checkId(id)){
            return new ResponseEntity<>("Student Don't Exist", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student s1){
        if(studentService.checkId(s1.getId())){
            return new ResponseEntity<>("Student already Exist", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(studentService.addStudent(s1), HttpStatus.CREATED);
    }
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Student updatedStudent){
        if(!studentService.checkId(id)){
            return new ResponseEntity<>("Student Don't Exist", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentService.updateStudent(id, updatedStudent), HttpStatus.ACCEPTED);    
        
    }
    // //put , delete mapping

    @DeleteMapping("/deleteStudent/{id}")
    public  ResponseEntity<?> eleteStudent(@PathVariable Long id){
        if(!studentService.checkId(id)){
            return new ResponseEntity<>("Student Don't exist", HttpStatus.NOT_FOUND);
        }
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Delete", HttpStatus.OK);
    }



}
