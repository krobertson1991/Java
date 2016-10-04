import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import kar.helloWorld.HelloWorld;

/**
 * <strong>Hello World Test</strong>
 * <p>This test was created in conjunction with the default package HelloWorld.java so that I can
 * test the TDD setup and how to create a JUnit test in Eclipse.</p>
 * @author Kelsey Robertson
 *
 */
public class HelloWorldTest {

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
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		HelloWorld.setString("Hello World!");
		assertEquals("Hello World!", HelloWorld.getString());
	}

}
