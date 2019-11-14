package org.codehaus.mojo.appassembler.model;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JvmSettingsTest</code> contains tests for the class <code>{@link JvmSettings}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class JvmSettingsTest {
	/**
	 * Run the void addExtraArgument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddExtraArgument_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String string = "";

		fixture.addExtraArgument(string);

		// add additional test code here
	}

	/**
	 * Run the void addSystemProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddSystemProperty_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String string = "";

		fixture.addSystemProperty(string);

		// add additional test code here
	}

	/**
	 * Run the List<String> getExtraArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetExtraArguments_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		List<String> result = fixture.getExtraArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getExtraArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetExtraArguments_2()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		List<String> result = fixture.getExtraArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getInitialMemorySize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the List<String> getSystemProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetSystemProperties_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		List<String> result = fixture.getSystemProperties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getSystemProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetSystemProperties_2()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();

		List<String> result = fixture.getSystemProperties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void removeExtraArgument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveExtraArgument_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String string = "";

		fixture.removeExtraArgument(string);

		// add additional test code here
	}

	/**
	 * Run the void removeSystemProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveSystemProperty_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String string = "";

		fixture.removeSystemProperty(string);

		// add additional test code here
	}

	/**
	 * Run the void setExtraArguments(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetExtraArguments_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		List<String> extraArguments = new LinkedList();

		fixture.setExtraArguments(extraArguments);

		// add additional test code here
	}

	/**
	 * Run the void setInitialMemorySize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetInitialMemorySize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String initialMemorySize = "";

		fixture.setInitialMemorySize(initialMemorySize);

		// add additional test code here
	}

	/**
	 * Run the void setMaxMemorySize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetMaxMemorySize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String maxMemorySize = "";

		fixture.setMaxMemorySize(maxMemorySize);

		// add additional test code here
	}

	/**
	 * Run the void setMaxStackSize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetMaxStackSize_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		String maxStackSize = "";

		fixture.setMaxStackSize(maxStackSize);

		// add additional test code here
	}

	/**
	 * Run the void setSystemProperties(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetSystemProperties_1()
		throws Exception {
		JvmSettings fixture = JvmSettingsFactory.createJvmSettings();
		List<String> systemProperties = new LinkedList();

		fixture.setSystemProperties(systemProperties);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JvmSettingsTest.class);
	}
}