package org.codehaus.mojo.appassembler.model;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ClasspathTest.class,
	ClasspathElementTest.class,
	DependencyTest.class,
	GeneratorConfigurationTest.class,
	DaemonTest.class,
	DirectoryTest.class,
	JvmSettingsTest.class,
	org.codehaus.mojo.appassembler.model.io.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
