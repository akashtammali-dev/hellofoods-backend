package com.hello.service;

import java.util.List;

import com.hello.Exception.FoodException;
import com.hello.Exception.RestaurantException;
import com.hello.model.Category;
import com.hello.model.Food;
import com.hello.model.Restaurant;
import com.hello.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
