package org.codehaus.mojo.appassembler;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JvmSettingsTest</code> contains tests for the class <code>{@link JvmSettings}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class JvmSettingsTest {
	/**
	 * Run the String[] getExtraArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetExtraArguments_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		String[] result = fixture.getExtraArguments();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getInitialMemorySize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetInitialMemorySize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		String result = fixture.getInitialMemorySize();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getMaxMemorySize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetMaxMemorySize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		String result = fixture.getMaxMemorySize();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getMaxStackSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetMaxStackSize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		String result = fixture.getMaxStackSize();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String[] getSystemProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetSystemProperties_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		String[] result = fixture.getSystemProperties();

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(JvmSettingsTest.class);
	}
}