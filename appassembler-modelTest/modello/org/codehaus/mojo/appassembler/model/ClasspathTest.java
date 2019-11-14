package org.codehaus.mojo.appassembler.model;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClasspathTest</code> contains tests for the class <code>{@link Classpath}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class ClasspathTest {
	/**
	 * Run the void addDependency(Dependency) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddDependency_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		Dependency dependency = DependencyFactory.createDependency();

		fixture.addDependency(dependency);

		// add additional test code here
	}

	/**
	 * Run the void addDirectory(Directory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddDirectory_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		Directory directory = DirectoryFactory.createDirectory();

		fixture.addDirectory(directory);

		// add additional test code here
	}

	/**
	 * Run the List<Dependency> getDependencies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetDependencies_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();

		List<Dependency> result = fixture.getDependencies();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Dependency> getDependencies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetDependencies_2()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();

		List<Dependency> result = fixture.getDependencies();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Directory> getDirectories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetDirectories_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();

		List<Directory> result = fixture.getDirectories();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Directory> getDirectories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetDirectories_2()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();

		List<Directory> result = fixture.getDirectories();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void removeDependency(Dependency) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveDependency_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		Dependency dependency = DependencyFactory.createDependency();

		fixture.removeDependency(dependency);

		// add additional test code here
	}

	/**
	 * Run the void removeDirectory(Directory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveDirectory_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		Directory directory = DirectoryFactory.createDirectory();

		fixture.removeDirectory(directory);

		// add additional test code here
	}

	/**
	 * Run the void setDependencies(List<Dependency>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetDependencies_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		List<Dependency> dependencies = new LinkedList();

		fixture.setDependencies(dependencies);

		// add additional test code here
	}

	/**
	 * Run the void setDirectories(List<Directory>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetDirectories_1()
		throws Exception {
		Classpath fixture = ClasspathFactory.createClasspath();
		List<Directory> directories = new LinkedList();

		fixture.setDirectories(directories);

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
		new org.junit.runner.JUnitCore().run(ClasspathTest.class);
	}
}