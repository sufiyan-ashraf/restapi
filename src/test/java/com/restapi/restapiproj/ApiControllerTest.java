package com.restapi.restapiproj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApiControllerTest {
	
	@LocalServerPort
	private int port=8080;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void validates_all_parameters_are_set() throws Exception {
	    ResponseEntity<String> response = restTemplate.getForEntity( "/entercandidate?name=",
	            String.class);
	    assertThat(response.getStatusCode().equals(HttpStatus.BAD_REQUEST));
	    assertThat(response.getBody().equals("{\"error\":\"At least one parameter is invalid or not supplied\"}"));
	}

}
