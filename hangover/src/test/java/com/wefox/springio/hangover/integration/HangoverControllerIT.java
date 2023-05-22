package com.wefox.springio.hangover.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wefox.springio.hangover.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HangoverControllerIT {
	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
		final RestTemplate restTemplate = new RestTemplate();
		final ResponseEntity<Employee[]> forEntity =
				restTemplate.getForEntity("http://localhost:" + port + "/hangover", Employee[].class);

		assertEquals(5, forEntity.getBody().length);
	}

}
