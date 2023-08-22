package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.SecurityQuestion;
import com.example.demo.repositories.SecurityQuestionRepository;

@Service
public class SecurityQuestionService 
{
	@Autowired
	public SecurityQuestionRepository secquesrepo;
	
	public SecurityQuestion getsecques(int quesid)
	{
		return secquesrepo.findById(quesid).get();
		
	}
}
