package zomato;

import java.util.*;

public class Restaurant { 
	private String restaurantName;
	private int rating;
	private Address restaurantAddress;
	private ArrayList<Food> menu=new ArrayList<>();
	private String restaurantId;
	
	
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public Address getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(Address restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	
	

}
