package com.example.ShopKart.Model;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String name;
    private String email;
    // private Map<Long, Item> userCart;
    User(){
        // Map<Long, Item>userCart  = new HashMap<Long, Item>();
    }
    public String getName(){ return this.name; }
    public String getEmail(){ return this.email;}
    // public Map<Long, Item> getCart(){ return this.usercart; }
    
    public void setName(String name){this.name = name;}
    public void setEmail(String email){this.email = email;}

}
