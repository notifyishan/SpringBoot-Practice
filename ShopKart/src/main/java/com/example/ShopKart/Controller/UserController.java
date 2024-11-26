package com.example.ShopKart.Controller;

import java.security.Provider.Service;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShopKart.Model.User;
import com.example.ShopKart.Service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<Map<Long, User>> getUser(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK) ;
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User u1){
        return new ResponseEntity<>(null)
    }
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User u1){
        if(userMap.containsKey(id)){
            userMap.put(id, u1);
            return new ResponseEntity<>(u1, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("User Don't exist", HttpStatus.OK);
        
    }
    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        if(userMap.containsKey(id)){
            return new ResponseEntity<>(null);
        }
        return new ResponseEntity<>(null);
    }

}
