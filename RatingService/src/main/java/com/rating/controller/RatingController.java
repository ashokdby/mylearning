package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.Rating;
import com.rating.service.RatingService;

@RestController
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/createrating")
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
		return     ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	@GetMapping("/getratings")
	public ResponseEntity<List<Rating>> getAllRating() {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatings());
	}
	
	@GetMapping("/getratingbyuserid/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId) {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));
	}
	
	
	@GetMapping("/getratinghotelid/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));
	}
	
	
	
	
	
	
	
}
