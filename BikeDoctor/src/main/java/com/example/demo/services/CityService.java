package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.repositories.CityRepository;

@Service
public class CityService {
	@Autowired
	public CityRepository cityrepo;
	
	public List<City> getall(){
		return cityrepo.findAll();
	}
}
