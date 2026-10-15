package com.example.order.model;

import java.util.List;

public class Order {
	private int userId;
	private int restaurant;
	private List<String> Items;
	public Order()
	{
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(int restaurant) {
		this.restaurant = restaurant;
	}
	public List<String> getItems() {
		return Items;
	}
	public void setItems(List<String> items) {
		Items = items;
	}	
	
	
	

}
