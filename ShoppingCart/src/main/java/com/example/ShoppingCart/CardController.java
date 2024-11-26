package com.example.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CardController {
    @Autowired
    Map<String, Cart> cartMap = new HashMap<>();
    @GetMapping("/GetAllItems")
    public ResponseEntity<?> getAllItems(){
        return new ResponseEntity<>(cartMap, HttpStatus.OK);
    }
    @GetMapping("/getItem/{itemname}")
    public ResponseEntity<?> getItem(@PathVariable String itemname){
        if(cartMap.containsKey(itemname)){
            return new ResponseEntity<>(cartMap.get(itemname), HttpStatus.FOUND);
        }
        return new ResponseEntity<>("Item Not Found", HttpStatus.NOT_FOUND);
    }
    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody Cart c1){
        if(cartMap.containsKey(c1.getitemname())){
            Cart c2 = cartMap.get(c1.getitemname());
            c2.setQty(c2.getQty() + 1);
            cartMap.put(c2.getitemname(), c2);
            return new ResponseEntity<>(c2, HttpStatus.OK);
        }
        cartMap.put(c1.getitemname(), c1);
        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteItem")
    public ResponseEntity<?> deleteItem(@RequestBody Cart c1){
        // return new ResponseEntity<>("Item is not added in your cart", HttpStatus.NO_CONTENT);
        // return "Hello";
        if(cartMap.containsKey(c1.getitemname())){
            System.out.println("Hello this is working");
            Cart c2 = cartMap.get(c1.getitemname());
            c2.setQty(c2.getQty() - 1);
            if(c2.getQty()== 0){
                cartMap.remove(c1.getitemname());
                return new ResponseEntity<>("Item is removed from your cart", HttpStatus.OK);
            }
            else {
                cartMap.put(c2.getitemname(), c2);
                return new ResponseEntity<>(c2, HttpStatus.ACCEPTED);
            }
        }
        return new ResponseEntity<>("Item is not added in your cart", HttpStatus.OK);
    
    }

}
