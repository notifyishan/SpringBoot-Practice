package com.example.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingCartApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}
	@Bean
	public Map<String,Cart> cartMap() {
		return new HashMap<>();
	}

}
	
