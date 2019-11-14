package org.codehaus.mojo.appassembler.daemon;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	DaemonGeneratorServiceTest.class,
	DaemonGenerationRequestTest.class,
	DaemonGeneratorExceptionTest.class,
	DaemonGeneratorTest.class,
	DefaultDaemonGeneratorServiceTest.class,
	org.codehaus.mojo.appassembler.daemon.booter.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.daemontools.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.generic.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.jsw.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.merge.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.script.TestAll.class,
	org.codehaus.mojo.appassembler.daemon.standard.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
