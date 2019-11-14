package org.codehaus.mojo.appassembler;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DaemonTest</code> contains tests for the class <code>{@link Daemon}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonTest {
	/**
	 * Run the Daemon() constructor test.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testDaemon_1()
		throws Exception {
		Daemon result = new Daemon();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<String> getCommandLineArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetCommandLineArguments_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<String> result = fixture.getCommandLineArguments();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getConfigurationDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetConfigurationDirectory_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getConfigurationDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDescriptor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetDescriptor_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getDescriptor();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEndorsedDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetEndorsedDir_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getEndorsedDir();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getEnvironmentSetupFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetEnvironmentSetupFileName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getEnvironmentSetupFileName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GeneratorConfiguration> getGeneratorConfigurations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetGeneratorConfigurations_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<GeneratorConfiguration> result = fixture.getGeneratorConfigurations();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the JvmSettings getJvmSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetJvmSettings_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		JvmSettings result = fixture.getJvmSettings();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLicenseHeaderFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetLicenseHeaderFile_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getLicenseHeaderFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLongName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetLongName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getLongName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getMainClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetMainClass_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getMainClass();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getPlatforms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPlatforms_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<String> result = fixture.getPlatforms();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getPlatforms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPlatforms_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<String> result = fixture.getPlatforms();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getPreWrapperConf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPreWrapperConf_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getPreWrapperConf();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getRepositoryName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetRepositoryName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getRepositoryName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getWrapperLogFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetWrapperLogFile_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getWrapperLogFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getWrapperMainClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetWrapperMainClass_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getWrapperMainClass();

		// add additional test code here
		assertEquals("org.tanukisoftware.wrapper.WrapperSimpleApp", result);
	}

	/**
	 * Run the boolean isShowConsoleWindow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testIsShowConsoleWindow_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isShowConsoleWindow();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isShowConsoleWindow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testIsShowConsoleWindow_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isShowConsoleWindow();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setEndorsedDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetEndorsedDir_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String endorsedDir = "";

		fixture.setEndorsedDir(endorsedDir);

		// add additional test code here
	}

	/**
	 * Run the void setEnvironmentSetupFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetEnvironmentSetupFileName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String environmentSetupFileName = "";

		fixture.setEnvironmentSetupFileName(environmentSetupFileName);

		// add additional test code here
	}

	/**
	 * Run the void setPreWrapperConf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetPreWrapperConf_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String preWrapperConf = "";

		fixture.setPreWrapperConf(preWrapperConf);

		// add additional test code here
	}

	/**
	 * Run the void setWrapperLogFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetWrapperLogFile_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String wrapperLogFile = "";

		fixture.setWrapperLogFile(wrapperLogFile);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DaemonTest.class);
	}
}