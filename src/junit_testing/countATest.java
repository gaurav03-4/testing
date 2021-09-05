package junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Junit_Test test = new Junit_Test();
		int output = test.countA("gaurav");
		assertEquals(2,output);
	}

}
