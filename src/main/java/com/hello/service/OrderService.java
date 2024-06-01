package com.hello.service;

import java.util.List;

import com.hello.Exception.CartException;
import com.hello.Exception.OrderException;
import com.hello.Exception.RestaurantException;
import com.hello.Exception.UserException;
import com.hello.model.Order;
import com.hello.model.PaymentResponse;
import com.hello.model.User;
import com.hello.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
