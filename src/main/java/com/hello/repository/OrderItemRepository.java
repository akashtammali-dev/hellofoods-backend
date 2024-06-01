package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
