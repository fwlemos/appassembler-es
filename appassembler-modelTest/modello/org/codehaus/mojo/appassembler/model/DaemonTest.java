package org.codehaus.mojo.appassembler.model;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DaemonTest</code> contains tests for the class <code>{@link Daemon}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonTest {
	/**
	 * Run the Daemon() constructor test.
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testDaemon_1()
		throws Exception {
		Daemon result = new Daemon();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addCommandLineArgument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddCommandLineArgument_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String string = "";

		fixture.addCommandLineArgument(string);

		// add additional test code here
	}

	/**
	 * Run the void addGeneratorConfiguration(GeneratorConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testAddGeneratorConfiguration_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		GeneratorConfiguration generatorConfiguration = GeneratorConfigurationFactory.createGeneratorConfiguration();

		fixture.addGeneratorConfiguration(generatorConfiguration);

		// add additional test code here
	}

	/**
	 * Run the List<ClasspathElement> getAllClasspathElements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetAllClasspathElements_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<ClasspathElement> result = fixture.getAllClasspathElements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ClasspathElement> getAllClasspathElements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetAllClasspathElements_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<ClasspathElement> result = fixture.getAllClasspathElements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Classpath getClasspath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetClasspath_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		Classpath result = fixture.getClasspath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getCommandLineArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetCommandLineArguments_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<String> result = fixture.getCommandLineArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getCommandLineArguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetCommandLineArguments_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<String> result = fixture.getCommandLineArguments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getConfigurationDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetConfigurationDirectory_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getConfigurationDirectory();

		// add additional test code here
		assertEquals("repo", result);
	}

	/**
	 * Run the String getEndorsedDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the String getExternalDeltaPackDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetExternalDeltaPackDirectory_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getExternalDeltaPackDirectory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<GeneratorConfiguration> getGeneratorConfigurations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetGeneratorConfigurations_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<GeneratorConfiguration> result = fixture.getGeneratorConfigurations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<GeneratorConfiguration> getGeneratorConfigurations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetGeneratorConfigurations_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		List<GeneratorConfiguration> result = fixture.getGeneratorConfigurations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the String getModelEncoding() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetModelEncoding_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getModelEncoding();

		// add additional test code here
		assertEquals("UTF-8", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the String getPreWrapperConf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetRepositoryName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getRepositoryName();

		// add additional test code here
		assertEquals("repo", result);
	}

	/**
	 * Run the String getUnixScriptTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetUnixScriptTemplate_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getUnixScriptTemplate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getWindowsScriptTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetWindowsScriptTemplate_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		String result = fixture.getWindowsScriptTemplate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getWrapperLogFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the boolean isUseDaemonIdAsWrapperConfName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseDaemonIdAsWrapperConfName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseDaemonIdAsWrapperConfName();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUseDaemonIdAsWrapperConfName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseDaemonIdAsWrapperConfName_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseDaemonIdAsWrapperConfName();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUseDaemonIdAsWrapperExePrefixName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseDaemonIdAsWrapperExePrefixName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseDaemonIdAsWrapperExePrefixName();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUseDaemonIdAsWrapperExePrefixName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseDaemonIdAsWrapperExePrefixName_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseDaemonIdAsWrapperExePrefixName();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUseTimestampInSnapshotFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseTimestampInSnapshotFileName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseTimestampInSnapshotFileName();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUseTimestampInSnapshotFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseTimestampInSnapshotFileName_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseTimestampInSnapshotFileName();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUseWildcardClassPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseWildcardClassPath_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseWildcardClassPath();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUseWildcardClassPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIsUseWildcardClassPath_2()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();

		boolean result = fixture.isUseWildcardClassPath();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeCommandLineArgument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveCommandLineArgument_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String string = "";

		fixture.removeCommandLineArgument(string);

		// add additional test code here
	}

	/**
	 * Run the void removeGeneratorConfiguration(GeneratorConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testRemoveGeneratorConfiguration_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		GeneratorConfiguration generatorConfiguration = GeneratorConfigurationFactory.createGeneratorConfiguration();

		fixture.removeGeneratorConfiguration(generatorConfiguration);

		// add additional test code here
	}

	/**
	 * Run the void setClasspath(Classpath) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetClasspath_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		Classpath classpath = ClasspathFactory.createClasspath();

		fixture.setClasspath(classpath);

		// add additional test code here
	}

	/**
	 * Run the void setCommandLineArguments(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetCommandLineArguments_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		List<String> commandLineArguments = new LinkedList();

		fixture.setCommandLineArguments(commandLineArguments);

		// add additional test code here
	}

	/**
	 * Run the void setConfigurationDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetConfigurationDirectory_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String configurationDirectory = "";

		fixture.setConfigurationDirectory(configurationDirectory);

		// add additional test code here
	}

	/**
	 * Run the void setEndorsedDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the void setExternalDeltaPackDirectory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetExternalDeltaPackDirectory_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String externalDeltaPackDirectory = "";

		fixture.setExternalDeltaPackDirectory(externalDeltaPackDirectory);

		// add additional test code here
	}

	/**
	 * Run the void setGeneratorConfigurations(List<GeneratorConfiguration>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetGeneratorConfigurations_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		List<GeneratorConfiguration> generatorConfigurations = new LinkedList();

		fixture.setGeneratorConfigurations(generatorConfigurations);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setJvmSettings(JvmSettings) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetJvmSettings_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		JvmSettings jvmSettings = JvmSettingsFactory.createJvmSettings();

		fixture.setJvmSettings(jvmSettings);

		// add additional test code here
	}

	/**
	 * Run the void setLicenseHeaderFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetLicenseHeaderFile_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String licenseHeaderFile = "";

		fixture.setLicenseHeaderFile(licenseHeaderFile);

		// add additional test code here
	}

	/**
	 * Run the void setLongName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetLongName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String longName = "";

		fixture.setLongName(longName);

		// add additional test code here
	}

	/**
	 * Run the void setMainClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetMainClass_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String mainClass = "";

		fixture.setMainClass(mainClass);

		// add additional test code here
	}

	/**
	 * Run the void setModelEncoding(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetModelEncoding_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String modelEncoding = "";

		fixture.setModelEncoding(modelEncoding);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPreWrapperConf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the void setRepositoryName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetRepositoryName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String repositoryName = "";

		fixture.setRepositoryName(repositoryName);

		// add additional test code here
	}

	/**
	 * Run the void setShowConsoleWindow(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetShowConsoleWindow_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		boolean showConsoleWindow = true;

		fixture.setShowConsoleWindow(showConsoleWindow);

		// add additional test code here
	}

	/**
	 * Run the void setUnixScriptTemplate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetUnixScriptTemplate_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String unixScriptTemplate = "";

		fixture.setUnixScriptTemplate(unixScriptTemplate);

		// add additional test code here
	}

	/**
	 * Run the void setUseDaemonIdAsWrapperConfName(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetUseDaemonIdAsWrapperConfName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		boolean useDaemonIdAsWrapperConfName = true;

		fixture.setUseDaemonIdAsWrapperConfName(useDaemonIdAsWrapperConfName);

		// add additional test code here
	}

	/**
	 * Run the void setUseDaemonIdAsWrapperExePrefixName(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetUseDaemonIdAsWrapperExePrefixName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		boolean useDaemonIdAsWrapperExePrefixName = true;

		fixture.setUseDaemonIdAsWrapperExePrefixName(useDaemonIdAsWrapperExePrefixName);

		// add additional test code here
	}

	/**
	 * Run the void setUseTimestampInSnapshotFileName(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetUseTimestampInSnapshotFileName_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		boolean useTimestampInSnapshotFileName = true;

		fixture.setUseTimestampInSnapshotFileName(useTimestampInSnapshotFileName);

		// add additional test code here
	}

	/**
	 * Run the void setUseWildcardClassPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetUseWildcardClassPath_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		boolean useWildcardClassPath = true;

		fixture.setUseWildcardClassPath(useWildcardClassPath);

		// add additional test code here
	}

	/**
	 * Run the void setWindowsScriptTemplate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetWindowsScriptTemplate_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String windowsScriptTemplate = "";

		fixture.setWindowsScriptTemplate(windowsScriptTemplate);

		// add additional test code here
	}

	/**
	 * Run the void setWrapperLogFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
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
	 * Run the void setWrapperMainClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetWrapperMainClass_1()
		throws Exception {
		Daemon fixture = DaemonFactory.createDaemon();
		String wrapperMainClass = "";

		fixture.setWrapperMainClass(wrapperMainClass);

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
		new org.junit.runner.JUnitCore().run(DaemonTest.class);
	}
}