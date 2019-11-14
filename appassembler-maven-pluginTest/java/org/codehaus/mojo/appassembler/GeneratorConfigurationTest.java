package org.codehaus.mojo.appassembler;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GeneratorConfigurationTest</code> contains tests for the class <code>{@link GeneratorConfiguration}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class GeneratorConfigurationTest {
	/**
	 * Run the Properties getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetConfiguration_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		Properties result = fixture.getConfiguration();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getGenerator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetIncludes_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		List<String> result = fixture.getIncludes();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setConfiguration(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		GeneratorConfiguration fixture = GeneratorConfigurationFactory.createGeneratorConfiguration();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("generator = null; configuration = null", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * @generatedBy CodePro at 11/11/19 3:34 AM
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
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GeneratorConfigurationTest.class);
	}
}