package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {

	
	public List<Hotel> getAll();
	public Hotel getHotel(String id);
	public Hotel createHotel(Hotel hotel);
	
}
