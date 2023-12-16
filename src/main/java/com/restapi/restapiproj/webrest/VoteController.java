package com.restapi.restapiproj.webrest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.*;
import jakarta.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class VoteController {
	
	
	Map<String,Integer> map=new HashMap<>();
	
	@PostMapping("/entercandidate")
	public ResponseEntity<Object> addCandidate(@Valid @NotNull @RequestParam String name) throws URISyntaxException {
		int count=0;
		map.put(name,count);
		System.out.println(map);
		return ResponseEntity
				.created(new URI("/entercandidate"))
				.body(map);
				
	}
	
	
	@PostMapping("/castvote")
	public ResponseEntity<Object> castVote(@RequestParam String name) {
		if(map.containsKey(name)) {
			map.put(name, map.getOrDefault(name, 0) + 1);
			System.out.println(map);
			return ResponseEntity
					.ok(map.get(name));
		}
		return null;
	}
	
	@GetMapping("/countvote")
	public int voteCount(@RequestParam String name) {
		if(map.containsKey(name)) {
			return map.get(name);
		}
		else {
			System.out.println("Invalid Candidate");
		}
		return map.getOrDefault(name, null);
	
	}
	
	@GetMapping("/listvote")
	public Map<String,Integer> candidateList() {
		return map;
	}
	
	@GetMapping("/getwinner")
	public String getWinner() {
		return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

}
