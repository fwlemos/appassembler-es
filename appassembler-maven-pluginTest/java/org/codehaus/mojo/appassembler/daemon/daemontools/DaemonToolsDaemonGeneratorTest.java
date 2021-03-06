package org.codehaus.mojo.appassembler.daemon.daemontools;

import org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequest;
import org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DaemonToolsDaemonGeneratorTest</code> contains tests for the class <code>{@link DaemonToolsDaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonToolsDaemonGeneratorTest {
	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_1()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(FileUtils.java:2424)
		//       at org.codehaus.plexus.util.FileUtils.forceMkdir(FileUtils.java:1613)
		//       at org.codehaus.mojo.appassembler.daemon.daemontools.DaemonToolsDaemonGenerator.generate(DaemonToolsDaemonGenerator.java:70)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_2()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_3()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest3();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest3(DaemonGenerationRequestFactory.java:62)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_4()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest4();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.maven.project.MavenProject.deepCopy(MavenProject.java:194)
		//       at org.apache.maven.project.MavenProject.<init>(MavenProject.java:187)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest4(DaemonGenerationRequestFactory.java:73)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_5()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest5();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest5(DaemonGenerationRequestFactory.java:84)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_6()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest6();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest6(DaemonGenerationRequestFactory.java:95)
	}

	/**
	 * Run the void generate(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGenerate_7()
		throws Exception {
		DaemonToolsDaemonGenerator fixture = DaemonToolsDaemonGeneratorFactory.createDaemonToolsDaemonGenerator();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		fixture.generate(request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(FileUtils.java:2424)
		//       at org.codehaus.plexus.util.FileUtils.forceMkdir(FileUtils.java:1613)
		//       at org.codehaus.mojo.appassembler.daemon.daemontools.DaemonToolsDaemonGenerator.generate(DaemonToolsDaemonGenerator.java:70)
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
		new org.junit.runner.JUnitCore().run(DaemonToolsDaemonGeneratorTest.class);
	}
}