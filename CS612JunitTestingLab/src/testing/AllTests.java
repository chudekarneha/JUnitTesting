package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CountTest.class, DivideTest_denominatorZero.class, DivideTest_negativeQuotient.class,
		DivideTest_positiveQuotient.class, SquareTest.class })
public class AllTests {

}
