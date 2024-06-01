package com.hello.service;

import java.util.List;

import com.hello.Exception.ReviewException;
import com.hello.model.Review;
import com.hello.model.User;
import com.hello.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
