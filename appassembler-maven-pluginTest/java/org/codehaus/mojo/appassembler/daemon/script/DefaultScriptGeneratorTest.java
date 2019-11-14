package org.codehaus.mojo.appassembler.daemon.script;

import java.io.File;
import org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.codehaus.mojo.appassembler.model.JvmSettings;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultScriptGeneratorTest</code> contains tests for the class <code>{@link DefaultScriptGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DefaultScriptGeneratorTest {
	/**
	 * Run the DefaultScriptGenerator() constructor test.
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testDefaultScriptGenerator_1()
		throws Exception {
		DefaultScriptGenerator result = new DefaultScriptGenerator();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testCreateBinScript_1()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "unix";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId("");
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.daemon.script.DefaultScriptGenerator.getLicenseHeader(DefaultScriptGenerator.java:83)
		//       at org.codehaus.mojo.appassembler.daemon.script.DefaultScriptGenerator.createBinScript(DefaultScriptGenerator.java:188)
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testCreateBinScript_2()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "unix";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId((String) null);
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.daemon.script.DefaultScriptGenerator.getLicenseHeader(DefaultScriptGenerator.java:83)
		//       at org.codehaus.mojo.appassembler.daemon.script.DefaultScriptGenerator.createBinScript(DefaultScriptGenerator.java:188)
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_3()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId((String) null);
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_4()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId((String) null);
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_5()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId("");
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_6()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId("");
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_7()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId("");
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
	}

	/**
	 * Run the void createBinScript(String,Daemon,File,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreateBinScript_8()
		throws Exception {
		DefaultScriptGenerator fixture = DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
		String platformName = "";
		Daemon daemon = new Daemon();
		daemon.setJvmSettings(new JvmSettings());
		daemon.setRepositoryName("");
		daemon.setMainClass("");
		daemon.setEndorsedDir("");
		daemon.setId("");
		File outputDirectory = new File("");
		String binFolder = "";

		fixture.createBinScript(platformName, daemon, outputDirectory, binFolder);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DefaultScriptGeneratorTest.class);
	}
}