package com.lab.task.repo;

import java.util.List;

import com.lab.task.model.Restaurant;

public interface RestaurantRepo {

	Restaurant getRestaurantById(int id);

	List<Restaurant> getAllRestaurants();

	void addRestaurant(Restaurant restaurant);

	void updateRestaurant(Restaurant restaurant);

	void deleteRestaurant(Restaurant restaurant);

}
