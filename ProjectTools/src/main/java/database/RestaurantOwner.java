package database;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class RestaurantOwner extends User{
	
	@OneToOne
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;
	
	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
}
