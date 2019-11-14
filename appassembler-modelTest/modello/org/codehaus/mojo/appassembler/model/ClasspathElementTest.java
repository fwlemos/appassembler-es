package org.codehaus.mojo.appassembler.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClasspathElementTest</code> contains tests for the class <code>{@link ClasspathElement}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class ClasspathElementTest {
	/**
	 * Run the String getRelativePath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetRelativePath_1()
		throws Exception {
		ClasspathElement fixture = ClasspathElementFactory.createClasspathElement();

		String result = fixture.getRelativePath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setRelativePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetRelativePath_1()
		throws Exception {
		ClasspathElement fixture = ClasspathElementFactory.createClasspathElement();
		String relativePath = "";

		fixture.setRelativePath(relativePath);

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
		new org.junit.runner.JUnitCore().run(ClasspathElementTest.class);
	}
}