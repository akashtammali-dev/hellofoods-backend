package com.hello.service;

import com.hello.model.Order;
import com.hello.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
