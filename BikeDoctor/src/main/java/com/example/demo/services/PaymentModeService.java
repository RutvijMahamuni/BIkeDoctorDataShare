package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.PaymentMode;
import com.example.demo.repositories.PaymentModeRepository;

@Service
public class PaymentModeService {
	
	public PaymentModeRepository paymoderepo;
	
	public List<PaymentMode> getall()
	{
		return paymoderepo.findAll();
	}

}
