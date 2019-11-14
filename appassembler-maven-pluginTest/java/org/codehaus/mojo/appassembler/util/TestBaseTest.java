package org.codehaus.mojo.appassembler.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TestBaseTest</code> contains tests for the class <code>{@link TestBase}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class TestBaseTest {
	/**
	 * Run the String getMavenBaseDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetMavenBaseDir_1()
		throws Exception {

		String result = TestBase.getMavenBaseDir();

		// add additional test code here
		assertEquals("D:\\Desktop", result);
	}

	/**
	 * Run the String getSrcDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetSrcDirectory_1()
		throws Exception {

		String result = TestBase.getSrcDirectory();

		// add additional test code here
		assertEquals("D:\\Desktop\\src", result);
	}

	/**
	 * Run the String getTargetDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetTargetDir_1()
		throws Exception {

		String result = TestBase.getTargetDir();

		// add additional test code here
		assertEquals("D:\\Desktop\\target\\", result);
	}

	/**
	 * Run the String getTestDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetTestDirectory_1()
		throws Exception {

		String result = TestBase.getTestDirectory();

		// add additional test code here
		assertEquals("D:\\Desktop\\src\\test", result);
	}

	/**
	 * Run the String getTestResourcesDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetTestResourcesDirectory_1()
		throws Exception {

		String result = TestBase.getTestResourcesDirectory();

		// add additional test code here
		assertEquals("D:\\Desktop\\src\\test\\resources\\", result);
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
		new org.junit.runner.JUnitCore().run(TestBaseTest.class);
	}
}