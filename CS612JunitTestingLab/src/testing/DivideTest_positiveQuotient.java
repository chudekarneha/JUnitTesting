package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest_positiveQuotient {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		 assertEquals(4.0, test.divide(20, 5), 0);
	     assertEquals(0.0, test.divide(0, 5), 0);
	}

}
