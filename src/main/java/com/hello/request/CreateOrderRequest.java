package com.hello.request;

import com.hello.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {
 
	private Long restaurantId;
	
	private Address deliveryAddress;
	
    
}
