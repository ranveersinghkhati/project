package zomato;

import java.util.*;

public class Order {
	private Customer customer;
	private Restaurant restaurant;
	private ArrayList<Food> foods = new ArrayList<>();
	private int totalPrice;
	private int orderId;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public ArrayList<Food> getFood() {
		return foods;
	}
	public void setFood(ArrayList<Food> food) {
		this.foods = food;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		int total_price=0;
		for(Food food:foods) {
		    total_price+=food.getPrice(); 
		}
		this.totalPrice=total_price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
}
