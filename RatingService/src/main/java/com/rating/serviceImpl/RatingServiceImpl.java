package com.rating.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	
	@Override
	public Rating createRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
