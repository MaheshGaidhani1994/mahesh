package com.nt.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.jpa.domain.City;
import com.nt.jpa.domain.Hotel;
import com.nt.jpa.domain.Review;
import com.nt.jpa.domain.ReviewDetails;

public interface HotelService {

	Hotel getHotel(City city, String name);

	Page<Review> getReviews(Hotel hotel, Pageable pageable);

	Review getReview(Hotel hotel, int index);

	Review addReview(Hotel hotel, ReviewDetails details);

	ReviewsSummery getReviewSummary(Hotel hotel);

}
