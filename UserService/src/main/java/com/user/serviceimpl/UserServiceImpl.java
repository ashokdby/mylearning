package com.user.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Hotel;
import com.user.entity.Rating;
import com.user.entity.User;
import com.user.exception.ResourceNotFoundException;
import com.user.externalservice.hotelservice.HotelService;
import com.user.repositories.UserRepository;
import com.user.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HotelService hotelService;
	
	List<User> list;
	
	private Logger logger  = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}

	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
		
	}

	/*@Override
	public Optional<User> getUser(long userId) {
		return userRepository.findById(userId);
	}*/
	
	@Override
	public User getUser(long userId) {
		//get single user from the database 
		System.out.println("First Test");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User user =  userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("userId not found"+userId));
		System.out.println("AshokkumarDubey");
		//fetch rating from above user
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//find ratingofUsers using RestTemplate class
		Rating[] ratingOfUsers =  restTemplate.getForObject("http://RATING-SERVICE/getratingbyuserid/"+user.getUserId(), Rating[].class);
		List<Rating> ratings = Arrays.asList(ratingOfUsers);
		logger.info("{} ", ratingOfUsers);
		
		
		//find every rating from ratingservice
		List<Rating> ratingList =  ratings.stream().map(rating -> {
			//find hotel using RestTemplate class
			//ResponseEntity<Hotel> forentity = restTemplate.getForEntity("http://HOTEL-SERVICE/gethotel/"+rating.getHotelId(), Hotel.class);
			//Hotel hotel = forentity.getBody();
			
			//find hotel using Feign client
			 Hotel hotel = hotelService.getHotel(rating.getHotelId());
			
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());
		user.setRatings(ratingList);
		return user;
		
	}
	
	


}
