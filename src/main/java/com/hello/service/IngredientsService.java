package com.hello.service;

import java.util.List;

import com.hello.Exception.FoodException;
import com.hello.Exception.RestaurantException;
import com.hello.model.Food;
import com.hello.model.IngredientCategory;
import com.hello.model.IngredientsItem;
import com.hello.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
