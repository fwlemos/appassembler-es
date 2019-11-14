package org.codehaus.mojo.appassembler.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeneratorConfigurationTest</code> contains tests for the class <code>{@link GeneratorConfiguration}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class GeneratorConfigurationTest {
	/**
	 * Run the void addConfiguration(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddConfiguration_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		String key = "";
		String value = "";

		fixture.addConfiguration(key, value);

		// add additional test code here
	}

	/**
	 * Run the void addInclude(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddInclude_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		String string = "";

		fixture.addInclude(string);

		// add additional test code here
	}

	/**
	 * Run the Properties getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetConfiguration_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		Properties result = fixture.getConfiguration();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Properties getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetConfiguration_2()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		Properties result = fixture.getConfiguration();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getGenerator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetGenerator_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		String result = fixture.getGenerator();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getIncludes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetIncludes_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		List<String> result = fixture.getIncludes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getIncludes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetIncludes_2()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		List<String> result = fixture.getIncludes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void removeInclude(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveInclude_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		String string = "";

		fixture.removeInclude(string);

		// add additional test code here
	}

	/**
	 * Run the void setConfiguration(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetConfiguration_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		Properties configuration = new Properties();

		fixture.setConfiguration(configuration);

		// add additional test code here
	}

	/**
	 * Run the void setGenerator(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetGenerator_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		String generator = "";

		fixture.setGenerator(generator);

		// add additional test code here
	}

	/**
	 * Run the void setIncludes(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetIncludes_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();
		List<String> includes = new LinkedList();

		fixture.setIncludes(includes);

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
		new org.junit.runner.JUnitCore().run(GeneratorConfigurationTest.class);
	}
}