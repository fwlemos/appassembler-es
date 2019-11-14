package org.codehaus.mojo.appassembler.daemon.merge;

import java.util.LinkedList;
import java.util.List;
import org.codehaus.mojo.appassembler.model.Classpath;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.codehaus.mojo.appassembler.model.JvmSettings;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultDaemonMergerTest</code> contains tests for the class <code>{@link DefaultDaemonMerger}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DefaultDaemonMergerTest {
	/**
	 * Run the Daemon mergeDaemons(Daemon,Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMergeDaemons_1()
		throws Exception {
		DefaultDaemonMerger fixture = DefaultDaemonMergerFactory.createDefaultDaemonMerger();
		Daemon dominant = null;
		Daemon recessive = new Daemon();

		Daemon result = fixture.mergeDaemons(dominant, recessive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getJvmSettings());
		assertEquals(null, result.getEndorsedDir());
		assertEquals(null, result.getClasspath());
		assertEquals("org.tanukisoftware.wrapper.WrapperSimpleApp", result.getWrapperMainClass());
		assertEquals(null, result.getWindowsScriptTemplate());
		assertEquals(false, result.isUseDaemonIdAsWrapperConfName());
		assertEquals(null, result.getUnixScriptTemplate());
		assertEquals(false, result.isUseWildcardClassPath());
		assertEquals(null, result.getExternalDeltaPackDirectory());
		assertEquals(null, result.getWrapperLogFile());
		assertEquals(null, result.getPreWrapperConf());
		assertEquals(true, result.isUseTimestampInSnapshotFileName());
		assertEquals(null, result.getMainClass());
		assertEquals("repo", result.getRepositoryName());
		assertEquals(false, result.isUseDaemonIdAsWrapperExePrefixName());
		assertEquals("repo", result.getConfigurationDirectory());
		assertEquals(null, result.getLongName());
		assertEquals("UTF-8", result.getModelEncoding());
		assertEquals(null, result.getLicenseHeaderFile());
		assertEquals(null, result.getEnvironmentSetupFileName());
		assertEquals(true, result.isShowConsoleWindow());
	}

	/**
	 * Run the Daemon mergeDaemons(Daemon,Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMergeDaemons_2()
		throws Exception {
		DefaultDaemonMerger fixture = DefaultDaemonMergerFactory.createDefaultDaemonMerger();
		Daemon dominant = new Daemon();
		Daemon recessive = null;

		Daemon result = fixture.mergeDaemons(dominant, recessive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getJvmSettings());
		assertEquals(null, result.getEndorsedDir());
		assertEquals(null, result.getClasspath());
		assertEquals("org.tanukisoftware.wrapper.WrapperSimpleApp", result.getWrapperMainClass());
		assertEquals(null, result.getWindowsScriptTemplate());
		assertEquals(false, result.isUseDaemonIdAsWrapperConfName());
		assertEquals(null, result.getUnixScriptTemplate());
		assertEquals(false, result.isUseWildcardClassPath());
		assertEquals(null, result.getExternalDeltaPackDirectory());
		assertEquals(null, result.getWrapperLogFile());
		assertEquals(null, result.getPreWrapperConf());
		assertEquals(true, result.isUseTimestampInSnapshotFileName());
		assertEquals(null, result.getMainClass());
		assertEquals("repo", result.getRepositoryName());
		assertEquals(false, result.isUseDaemonIdAsWrapperExePrefixName());
		assertEquals("repo", result.getConfigurationDirectory());
		assertEquals(null, result.getLongName());
		assertEquals("UTF-8", result.getModelEncoding());
		assertEquals(null, result.getLicenseHeaderFile());
		assertEquals(null, result.getEnvironmentSetupFileName());
		assertEquals(true, result.isShowConsoleWindow());
	}

	/**
	 * Run the Daemon mergeDaemons(Daemon,Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMergeDaemons_3()
		throws Exception {
		DefaultDaemonMerger fixture = DefaultDaemonMergerFactory.createDefaultDaemonMerger();
		Daemon dominant = new Daemon();
		dominant.setRepositoryName("");
		dominant.setId("");
		dominant.setShowConsoleWindow(true);
		dominant.setJvmSettings(new JvmSettings());
		dominant.setClasspath(new Classpath());
		dominant.setEndorsedDir("");
		dominant.setMainClass("");
		dominant.setConfigurationDirectory("");
		dominant.setLicenseHeaderFile("");
		dominant.setCommandLineArguments(new LinkedList());
		Daemon recessive = new Daemon();
		recessive.setRepositoryName("");
		recessive.setId("");
		recessive.setJvmSettings(new JvmSettings());
		recessive.setClasspath(new Classpath());
		recessive.setEndorsedDir("");
		recessive.setMainClass("");
		recessive.setConfigurationDirectory("");
		recessive.setLicenseHeaderFile("");
		recessive.setCommandLineArguments(new LinkedList());

		Daemon result = fixture.mergeDaemons(dominant, recessive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals("", result.getId());
		assertEquals("", result.getEndorsedDir());
		assertEquals("org.tanukisoftware.wrapper.WrapperSimpleApp", result.getWrapperMainClass());
		assertEquals(null, result.getWindowsScriptTemplate());
		assertEquals(false, result.isUseDaemonIdAsWrapperConfName());
		assertEquals(null, result.getUnixScriptTemplate());
		assertEquals(false, result.isUseWildcardClassPath());
		assertEquals(null, result.getExternalDeltaPackDirectory());
		assertEquals(null, result.getWrapperLogFile());
		assertEquals(null, result.getPreWrapperConf());
		assertEquals(true, result.isUseTimestampInSnapshotFileName());
		assertEquals("", result.getMainClass());
		assertEquals("", result.getRepositoryName());
		assertEquals(false, result.isUseDaemonIdAsWrapperExePrefixName());
		assertEquals("", result.getConfigurationDirectory());
		assertEquals(null, result.getLongName());
		assertEquals("UTF-8", result.getModelEncoding());
		assertEquals("", result.getLicenseHeaderFile());
		assertEquals(null, result.getEnvironmentSetupFileName());
		assertEquals(true, result.isShowConsoleWindow());
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
		new org.junit.runner.JUnitCore().run(DefaultDaemonMergerTest.class);
	}
}