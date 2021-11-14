package testing;

import org.junit.Test;

public class DivideTest_denominatorZero {

	@Test (expected = ArithmeticException.class )
	public void test() {
		JunitTesting test = new JunitTesting();
		test.divide(2, 0);
	}

}
