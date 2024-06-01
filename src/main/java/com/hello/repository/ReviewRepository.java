package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
