package com.example.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.model.Order;

@RestController
public class OrderController {
	@PostMapping("/orders")
	public String place(@RequestBody Order ord) {
		
		return "Order placed Successfully(❁´◡`❁)\n "
				+"UserId :"+ord.getUserId()
				+"\nResturantId: "+ord.getRestaurant()
				+"\nItems :"+ord.getItems();
		
		
	}
	
	
	

}
