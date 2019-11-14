package org.codehaus.mojo.appassembler;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProgramTest</code> contains tests for the class <code>{@link Program}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class ProgramTest {
	/**
	 * Run the Program() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testProgram_1()
		throws Exception {

		Program result = new Program();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getMainClass());
		assertEquals(null, result.getPlatforms());
		assertEquals(null, result.getJvmSettings());
		assertEquals(null, result.getBinFolder());
		assertEquals(null, result.getCommandLineArguments());
		assertEquals(null, result.getLicenseHeaderFile());
	}

	/**
	 * Run the Program(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testProgram_2()
		throws Exception {
		String name = "";
		String mainClass = "";

		Program result = new Program(name, mainClass);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getId());
		assertEquals("", result.getMainClass());
		assertEquals(null, result.getPlatforms());
		assertEquals(null, result.getJvmSettings());
		assertEquals(null, result.getBinFolder());
		assertEquals(null, result.getCommandLineArguments());
		assertEquals(null, result.getLicenseHeaderFile());
	}

	/**
	 * Run the void addCommandLineArgument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testAddCommandLineArgument_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram2();
		String argument = "";

		fixture.addCommandLineArgument(argument);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.Program.addCommandLineArgument(Program.java:210)
	}

	/**
	 * Run the File getBinFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetBinFolder_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram();

		File result = fixture.getBinFolder();

		// add additional test code here
		assertEquals(null, result);
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
		Program fixture = ProgramFactory.createProgram3();

		List<String> result = fixture.getCommandLineArguments();

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
		Program fixture = ProgramFactory.createProgram2();

		String result = fixture.getId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the org.codehaus.mojo.appassembler.model.JvmSettings getJvmSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetJvmSettings_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram3();

		org.codehaus.mojo.appassembler.model.JvmSettings result = fixture.getJvmSettings();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getLicenseHeaderFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetLicenseHeaderFile_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram2();

		File result = fixture.getLicenseHeaderFile();

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
		Program fixture = ProgramFactory.createProgram2();

		String result = fixture.getMainClass();

		// add additional test code here
		assertEquals("0123456789", result);
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
		Program fixture = ProgramFactory.createProgram();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Set<String> getPlatforms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPlatforms_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram();

		Set<String> result = fixture.getPlatforms();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setBinFolder(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetBinFolder_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram2();
		File binFolder = new File("");

		fixture.setBinFolder(binFolder);

		// add additional test code here
	}

	/**
	 * Run the void setCommandLineArguments(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetCommandLineArguments_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram();
		List<String> arguments = new LinkedList();

		fixture.setCommandLineArguments(arguments);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram();
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setJvmSettings(JvmSettings) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetJvmSettings_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram();
		org.codehaus.mojo.appassembler.model.JvmSettings jvmSettings = new org.codehaus.mojo.appassembler.model.JvmSettings();

		fixture.setJvmSettings(jvmSettings);

		// add additional test code here
	}

	/**
	 * Run the void setLicenseHeaderFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetLicenseHeaderFile_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram3();
		File licenseHeaderFile = new File("");

		fixture.setLicenseHeaderFile(licenseHeaderFile);

		// add additional test code here
	}

	/**
	 * Run the void setMainClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetMainClass_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram3();
		String mainClass = "";

		fixture.setMainClass(mainClass);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram3();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPlatforms(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetPlatforms_1()
		throws Exception {
		Program fixture = ProgramFactory.createProgram2();
		Set<String> platforms = new HashSet();

		fixture.setPlatforms(platforms);

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
		new org.junit.runner.JUnitCore().run(ProgramTest.class);
	}
}