package org.codehaus.mojo.appassembler.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DependencyTest</code> contains tests for the class <code>{@link Dependency}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DependencyTest {
	/**
	 * Run the String getArtifactId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetArtifactId_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();

		String result = fixture.getArtifactId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getClassifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetClassifier_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();

		String result = fixture.getClassifier();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getGroupId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetGroupId_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();

		String result = fixture.getGroupId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setArtifactId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetArtifactId_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();
		String artifactId = "";

		fixture.setArtifactId(artifactId);

		// add additional test code here
	}

	/**
	 * Run the void setClassifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetClassifier_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();
		String classifier = "";

		fixture.setClassifier(classifier);

		// add additional test code here
	}

	/**
	 * Run the void setGroupId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetGroupId_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();
		String groupId = "";

		fixture.setGroupId(groupId);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		Dependency fixture = DependencyFactory.createDependency();
		String version = "";

		fixture.setVersion(version);

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
		new org.junit.runner.JUnitCore().run(DependencyTest.class);
	}
}