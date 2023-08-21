package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ServiceCentre;
import com.example.demo.services.ServiceCentreService;

@CrossOrigin("http://localhost:3000")
@RestController
public class ServiceCentreController {
	
	@Autowired
	ServiceCentreService servcenservice;
	
	@GetMapping("/getallservcen")
	public List<ServiceCentre> getall()
	{
		return servcenservice.getall();
	}
}
