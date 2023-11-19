package com.example.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsdemoApplicationTests {

	@Test
	void contextLoads() {
		Calaculate ca=new Calaculate();
		assertEquals(5, ca.addnumber(2, 3));
	}

}
