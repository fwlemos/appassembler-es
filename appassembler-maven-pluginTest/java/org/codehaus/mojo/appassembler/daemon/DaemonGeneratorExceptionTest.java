package org.codehaus.mojo.appassembler.daemon;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DaemonGeneratorExceptionTest</code> contains tests for the class <code>{@link DaemonGeneratorException}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonGeneratorExceptionTest {
	/**
	 * Run the DaemonGeneratorException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testDaemonGeneratorException_1()
		throws Exception {
		String message = "";

		DaemonGeneratorException result = new DaemonGeneratorException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the DaemonGeneratorException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testDaemonGeneratorException_2()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		DaemonGeneratorException result = new DaemonGeneratorException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DaemonGeneratorExceptionTest.class);
	}
}