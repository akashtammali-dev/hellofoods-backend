package com.hello.service;

import com.hello.Exception.CartException;
import com.hello.Exception.CartItemException;
import com.hello.Exception.FoodException;
import com.hello.Exception.UserException;
import com.hello.model.Cart;
import com.hello.model.CartItem;
import com.hello.model.Food;
import com.hello.model.User;
import com.hello.request.AddCartItemRequest;
import com.hello.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
