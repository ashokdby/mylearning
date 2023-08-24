package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {

	public Rating createRating(Rating rating);
	public List<Rating> getAllRatings();
	public List<Rating> getRatingByUserId(String userId);
	public List<Rating> getRatingByHotelId(String hotelId);
	
}
