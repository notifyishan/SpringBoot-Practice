package com.example.ShopKart.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ShopKart.Model.User;

public class UserServiceImpl implements UserService {
    @Autowired
    Map<Long , User> userMap;
    Long userid = 0L;
    @Override
    public Map<Long, User> getAllUser() {
        return userMap;
    }

    @Override
    public User getUser(Long id) {
        return userMap.get(id);
    }

    @Override
    public User addUser(User u1) {
        userid++;
        return userMap.put(userid, u1);
    }

    @Override
    public User updateUser(Long id, User u1) {
        userMap.put(id, u1);
        return u1;
    }

    @Override
    public Boolean deletUser(Long id) {
        if(!userMap.containsKey(id)) return false;
        userMap.remove(id);
        return true;       
    }

    @Override
    public Boolean checkUser(Long id) {
        return userMap.containsKey(id);
    }
    
}
