package com.example.Student;

public class Student {
    Long id;
    String name;
    String email;
    String course;
    // Student(){ }
    // Student(Long id, String name, String email, String course){
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    //     this.course = course;
    // }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", course='" + course + '\'' + '}';
    }


}
