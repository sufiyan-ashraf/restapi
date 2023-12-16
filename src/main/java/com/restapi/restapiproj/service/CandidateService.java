package com.restapi.restapiproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.restapiproj.entity.CandidateInfo;
import com.restapi.restapiproj.repo.CandidateRepo;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepo repo;
	
	public void addCandidate(String name) {
		System.out.println("Service**************************"+name);
		repo.createCandidate(name);
	}

}
