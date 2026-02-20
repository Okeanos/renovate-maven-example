package com.nikolasgrottendieck.${{ values.projectName }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ${{ values.springName }}ApplicationTest {

	@Test
	public void contextLoads() {
		// intentionally left blank
	}
}
