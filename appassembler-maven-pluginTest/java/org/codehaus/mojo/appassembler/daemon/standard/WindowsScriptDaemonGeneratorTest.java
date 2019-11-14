package org.codehaus.mojo.appassembler.daemon.standard;

import org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequest;
import org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WindowsScriptDaemonGeneratorTest</code> contains tests for the class <code>{@link WindowsScriptDaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class WindowsScriptDaemonGeneratorTest {
	/**
	 * Run the WindowsScriptDaemonGenerator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testWindowsScriptDaemonGenerator_1()
		throws Exception {

		WindowsScriptDaemonGenerator result = new WindowsScriptDaemonGenerator();

		// add additional test code here
		assertNotNull(result);
		assertEquals("windows", result.getPlatformName());
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_1()
		throws Exception {
		WindowsScriptDaemonGenerator fixture = WindowsScriptDaemonGeneratorFactory.createWindowsScriptDaemonGenerator();
		DaemonGenerationRequest generationRequest = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		fixture.generate(generationRequest);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.daemon.standard.WindowsScriptDaemonGenerator.generate(WindowsScriptDaemonGenerator.java:48)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_2()
		throws Exception {
		WindowsScriptDaemonGenerator fixture = WindowsScriptDaemonGeneratorFactory.createWindowsScriptDaemonGenerator();
		DaemonGenerationRequest generationRequest = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();

		fixture.generate(generationRequest);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
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
		new org.junit.runner.JUnitCore().run(WindowsScriptDaemonGeneratorTest.class);
	}
}