package junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		Junit_Test test = new Junit_Test();
		int output = test.square(5);
		assertEquals(25,output);
	}

}
