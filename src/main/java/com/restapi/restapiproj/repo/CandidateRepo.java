package com.restapi.restapiproj.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restapi.restapiproj.entity.CandidateInfo;


@Repository
public class CandidateRepo {
	

	private CandidateInfo cadidateinfo=null;
	
	Map<String,Integer> map=new HashMap<>();
	
	public void createCandidate(String name) {
		int count=0;
		cadidateinfo.setCandidateName(name);
		cadidateinfo.setVoteCount(count);
		map.put(cadidateinfo.getCandidateName(), cadidateinfo.getVoteCount());
		System.out.println(map);
	}

	

}
