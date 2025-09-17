package com.vico.cinespring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vico.cinespring.service.BusinessService;

@SpringBootTest
class SpringbootDemoApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWord() {
		String expected = "Hello World!";

		String result = bs.getHelloWord().getValue();

		assertEquals(expected, result);
	}

}