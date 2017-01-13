/**
 * 
 */
package kar.problem3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kelseyr
 *
 */
public class Problem3Attemp1Test {

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
	 * <p>The prime factors of 13195 are 5, 7, 13, and 29.</br>
	 * What is the largest prime factor of the number 600851475143?</p>
	 */
	@Test
	public void test() {
		Problem3Attempt1.calculatePrime(13195);
		Integer test = 29;
		assertEquals(test, Problem3Attempt1.getLargePrime());
	}

}
