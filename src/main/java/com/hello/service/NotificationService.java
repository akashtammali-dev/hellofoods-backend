package com.hello.service;

import java.util.List;

import com.hello.model.Notification;
import com.hello.model.Order;
import com.hello.model.Restaurant;
import com.hello.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
