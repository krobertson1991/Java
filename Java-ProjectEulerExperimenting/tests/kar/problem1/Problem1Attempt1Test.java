/**
 * 
 */
package kar.problem1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <strong>Multiples of 3 and 5: Attempt 1</strong>
 * <p>If we listed all the natural numbers below 10 that are multiples of 3 or 5, we 
 * get 3, 5, 6, and 9.  The sum of these multiples is 23. </br> Find the sum of all the
 * multiples of 3 or 5 below 1000.</p>
 * @author Kelsey Robertson
 *
 */
public class Problem1Attempt1Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * The multiples of 3 and 5 under 10 are 3, 5, 6, and 9.  The sum of them together should be 23.
	 * This test looks for that.
	 */
	@Test
	public void test10() {
		Problem1Attempt1.calculate(10);
		Integer test = 23;
		assertEquals(test, Problem1Attempt1.getAnswer());
	}

}
