package org.codehaus.mojo.appassembler.daemon.script;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstactScriptDaemonGeneratorTest</code> contains tests for the class <code>{@link AbstactScriptDaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AbstactScriptDaemonGeneratorTest {
	/**
	 * Run the String getPlatformName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPlatformName_1()
		throws Exception {
		AbstactScriptDaemonGenerator fixture = AbstactScriptDaemonGeneratorFactory.createcreateUnixBooterDaemonGenerator();

		String result = fixture.getPlatformName();

		// add additional test code here
		assertEquals("unix", result);
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
		new org.junit.runner.JUnitCore().run(AbstactScriptDaemonGeneratorTest.class);
	}
}