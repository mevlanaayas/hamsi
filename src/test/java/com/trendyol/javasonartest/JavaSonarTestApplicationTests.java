package com.trendyol.javasonartest;

import com.trendyol.javasonartest.flag.Toggle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaSonarTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@ToggleTesting(treated = Toggle.ENABLE_X)
	@Test
	public void some_unit_test() {

	}

	@ToggleTesting(treated = Toggle.DISABLE_Y)
	@Test
	public void some_unit_test_two() {

	}
}
