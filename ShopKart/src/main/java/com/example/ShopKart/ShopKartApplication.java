package com.example.ShopKart;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ShopKart.Model.User;

@SpringBootApplication
public class ShopKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopKartApplication.class, args);
	}
	@Bean
	public Map<Long, User> userMap(){
		return new HashMap<>();
	}
	

}
