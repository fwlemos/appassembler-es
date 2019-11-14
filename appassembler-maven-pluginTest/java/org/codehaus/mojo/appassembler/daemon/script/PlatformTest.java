package org.codehaus.mojo.appassembler.daemon.script;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.codehaus.mojo.appassembler.model.JvmSettings;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PlatformTest</code> contains tests for the class <code>{@link Platform}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class PlatformTest {
	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Object o = PlatformFactory.createPlatform();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Object o = null;

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Object o = PlatformFactory.createPlatform();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Object o = PlatformFactory.createPlatform();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the Set<String> getAllPlatformNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAllPlatformNames_1()
		throws Exception {

		Set<String> result = Platform.getAllPlatformNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains("windows"));
		assertTrue(result.contains("unix"));
	}

	/**
	 * Run the Set<Platform> getAllPlatforms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAllPlatforms_1()
		throws Exception {

		Set<Platform> result = Platform.getAllPlatforms();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the String getAppArguments(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAppArguments_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon descriptor = new Daemon();
		descriptor.setCommandLineArguments(new LinkedList());

		String result = fixture.getAppArguments(descriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getAppArguments(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAppArguments_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon descriptor = new Daemon();
		descriptor.setCommandLineArguments(new LinkedList());

		String result = fixture.getAppArguments(descriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getAppArguments(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAppArguments_3()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon descriptor = new Daemon();
		descriptor.setCommandLineArguments(new LinkedList());

		String result = fixture.getAppArguments(descriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getAppArguments(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAppArguments_4()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon descriptor = new Daemon();
		descriptor.setCommandLineArguments(new LinkedList());

		String result = fixture.getAppArguments(descriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getAppArguments(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetAppArguments_5()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon descriptor = new Daemon();
		descriptor.setCommandLineArguments(new LinkedList());

		String result = fixture.getAppArguments(descriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getBasedir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetBasedir_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getBasedir();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getBasedir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetBasedir_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getBasedir();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getBinFileExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetBinFileExtension_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getBinFileExtension();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getClassPath(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetClassPath_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();

		String result = fixture.getClassPath(daemon);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClassPath(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetClassPath_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();

		String result = fixture.getClassPath(daemon);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClassPath(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetClassPath_3()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();

		String result = fixture.getClassPath(daemon);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClassPath(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetClassPath_4()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();

		String result = fixture.getClassPath(daemon);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getClassPath(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetClassPath_5()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();

		String result = fixture.getClassPath(daemon);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCommentPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetCommentPrefix_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getCommentPrefix();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getCommentPrefix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetCommentPrefix_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getCommentPrefix();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getEnvSetup(Daemon,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetEnvSetup_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();
		daemon.setEnvironmentSetupFileName("");
		String binFolder = "";

		String result = fixture.getEnvSetup(daemon, binFolder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getEnvSetup(Daemon,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetEnvSetup_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();
		daemon.setEnvironmentSetupFileName("");
		String binFolder = "";

		String result = fixture.getEnvSetup(daemon, binFolder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getExtraJvmArguments(JvmSettings) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetExtraJvmArguments_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		JvmSettings jvmSettings = null;

		String result = fixture.getExtraJvmArguments(jvmSettings);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getExtraJvmArguments(JvmSettings) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetExtraJvmArguments_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		JvmSettings jvmSettings = new JvmSettings();
		jvmSettings.setMaxStackSize("");
		jvmSettings.setSystemProperties(new LinkedList());
		jvmSettings.setExtraArguments(new LinkedList());
		jvmSettings.setMaxMemorySize("");
		jvmSettings.setInitialMemorySize("");

		String result = fixture.getExtraJvmArguments(jvmSettings);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the Platform getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetInstance_1()
		throws Exception {
		String platformName = "";

		Platform result = Platform.getInstance(platformName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Platform getInstance(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGetInstance_2()
		throws Exception {
		String platformName = "";

		Platform result = Platform.getInstance(platformName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInterpolationToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetInterpolationToken_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getInterpolationToken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getInterpolationToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetInterpolationToken_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getInterpolationToken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getNewLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetNewLine_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getNewLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getNewLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetNewLine_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getNewLine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPathSeparator_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getPathSeparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPathSeparator_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getPathSeparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_1()
		throws Exception {
		List<String> platformList = new LinkedList();

		Set<Platform> result = Platform.getPlatformSet(platformList);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_2()
		throws Exception {
		List<String> platformList = new LinkedList();

		Set<Platform> result = Platform.getPlatformSet(platformList);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_3()
		throws Exception {
		List<String> platformList = null;
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_4()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_5()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_6()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_7()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_8()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<Platform> getPlatformSet(List<String>,Set<Platform>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetPlatformSet_9()
		throws Exception {
		List<String> platformList = new LinkedList();
		Set<Platform> allSet = new HashSet();

		Set<Platform> result = Platform.getPlatformSet(platformList, allSet);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getRepo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetRepo_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getRepo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getRepo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetRepo_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getRepo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetSeparator_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getSeparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetSeparator_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		String result = fixture.getSeparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isShowConsoleWindow(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testIsShowConsoleWindow_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();
		daemon.setShowConsoleWindow(true);

		boolean result = fixture.isShowConsoleWindow(daemon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the boolean isShowConsoleWindow(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testIsShowConsoleWindow_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		Daemon daemon = new Daemon();
		daemon.setShowConsoleWindow(false);

		boolean result = fixture.isShowConsoleWindow(daemon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
		assertTrue(result);
	}

	/**
	 * Run the void setBinFileExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testSetBinFileExtension_1()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		String binFileExtension = "";

		fixture.setBinFileExtension(binFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
	}

	/**
	 * Run the void setBinFileExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testSetBinFileExtension_2()
		throws Exception {
		Platform fixture = PlatformFactory.createPlatform();
		String binFileExtension = null;

		fixture.setBinFileExtension(binFileExtension);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException: Unknown platform name ''
		//       at org.codehaus.mojo.appassembler.daemon.script.Platform.getInstance(Platform.java:107)
		//       at org.codehaus.mojo.appassembler.daemon.script.PlatformFactory.createPlatform(PlatformFactory.java:30)
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
		new org.junit.runner.JUnitCore().run(PlatformTest.class);
	}
}