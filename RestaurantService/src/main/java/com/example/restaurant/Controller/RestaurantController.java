package com.example.restaurant.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.model.Restaurant;

@RestController

public class RestaurantController {
	@PostMapping("/restaurant")
	public String getReesult(@RequestParam Restaurant res)
	{
		return "hello";
	}
	

}
