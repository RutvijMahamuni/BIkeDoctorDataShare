package com.example.demo.services;

import java.awt.geom.Area;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Areas;
import com.example.demo.repositories.AreaRepository;

@Service
public class AreaService {

	@Autowired
	public AreaRepository arearepo;
	public List<Areas> getall(){
		return arearepo.findAll();
	}
}
