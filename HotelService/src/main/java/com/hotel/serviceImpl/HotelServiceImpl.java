package com.hotel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repositories.HotelRepository;
import com.hotel.service.HotelService;

@Service
public class HotelServiceImpl  implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("String not found", id, 0));
	}

	@Override
	public Hotel createHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	

}
