package org.codehaus.mojo.appassembler.daemon;

import java.io.File;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.DefaultArtifactRepository;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.project.MavenProject;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DaemonGenerationRequestTest</code> contains tests for the class <code>{@link DaemonGenerationRequest}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonGenerationRequestTest {
	/**
	 * Run the DaemonGenerationRequest() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testDaemonGenerationRequest_1()
		throws Exception {

		DaemonGenerationRequest result = new DaemonGenerationRequest();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStubDaemon());
		assertEquals(null, result.getDaemon());
		assertEquals(null, result.getBinFolder());
		assertEquals(null, result.getBinScriptName());
		assertEquals(null, result.getPlatform());
		assertEquals(null, result.getOutputDirectory());
		assertEquals(null, result.getMavenProject());
		assertEquals(null, result.getLocalRepository());
		assertEquals(null, result.getOutputFileNameMapping());
		assertEquals(null, result.getStubDescriptor());
	}

	/**
	 * Run the DaemonGenerationRequest(Daemon,MavenProject,ArtifactRepository,File,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testDaemonGenerationRequest_2()
		throws Exception {
		Daemon daemon = new Daemon();
		MavenProject project = new MavenProject();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		File outputDir = new File("");
		String binFolder = "";

		DaemonGenerationRequest result = new DaemonGenerationRequest(daemon, project, localRepository, outputDir, binFolder);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStubDaemon());
		assertEquals("", result.getBinFolder());
		assertEquals(null, result.getBinScriptName());
		assertEquals(null, result.getPlatform());
		assertEquals(null, result.getOutputFileNameMapping());
		assertEquals(null, result.getStubDescriptor());
	}

	/**
	 * Run the String getBinFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetBinFolder_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest5();

		String result = fixture.getBinFolder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest5(DaemonGenerationRequestFactory.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the String getBinScriptName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetBinScriptName_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest3();

		String result = fixture.getBinScriptName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest3(DaemonGenerationRequestFactory.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the Daemon getDaemon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetDaemon_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		Daemon result = fixture.getDaemon();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArtifactRepository getLocalRepository() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetLocalRepository_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		ArtifactRepository result = fixture.getLocalRepository();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MavenProject getMavenProject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetMavenProject_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest5();

		MavenProject result = fixture.getMavenProject();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest5(DaemonGenerationRequestFactory.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the File getOutputDirectory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetOutputDirectory_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest3();

		File result = fixture.getOutputDirectory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest3(DaemonGenerationRequestFactory.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the String getOutputFileNameMapping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetOutputFileNameMapping_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		String result = fixture.getOutputFileNameMapping();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPlatform() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetPlatform_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		String result = fixture.getPlatform();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArtifactRepositoryLayout getRepositoryLayout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetRepositoryLayout_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest3();

		ArtifactRepositoryLayout result = fixture.getRepositoryLayout();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest3(DaemonGenerationRequestFactory.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the Daemon getStubDaemon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetStubDaemon_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest5();

		Daemon result = fixture.getStubDaemon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest5(DaemonGenerationRequestFactory.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the File getStubDescriptor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testGetStubDescriptor_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest3();

		File result = fixture.getStubDescriptor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest3(DaemonGenerationRequestFactory.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the void setBinFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetBinFolder_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest6();
		String binFolder = "";

		fixture.setBinFolder(binFolder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest6(DaemonGenerationRequestFactory.java:95)
	}

	/**
	 * Run the void setBinScriptName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetBinScriptName_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest4();
		String binScriptName = "";

		fixture.setBinScriptName(binScriptName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.maven.project.MavenProject.deepCopy(MavenProject.java:194)
		//       at org.apache.maven.project.MavenProject.<init>(MavenProject.java:187)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest4(DaemonGenerationRequestFactory.java:73)
	}

	/**
	 * Run the void setDaemon(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetDaemon_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();
		Daemon daemon = new Daemon();

		fixture.setDaemon(daemon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
	}

	/**
	 * Run the void setLocalRepository(ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetLocalRepository_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.setLocalRepository(localRepository);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
	}

	/**
	 * Run the void setMavenProject(MavenProject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetMavenProject_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest6();
		MavenProject mavenProject = new MavenProject();

		fixture.setMavenProject(mavenProject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest6(DaemonGenerationRequestFactory.java:95)
	}

	/**
	 * Run the void setOutputDirectory(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetOutputDirectory_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest4();
		File outputDirectory = new File("");

		fixture.setOutputDirectory(outputDirectory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.maven.project.MavenProject.deepCopy(MavenProject.java:194)
		//       at org.apache.maven.project.MavenProject.<init>(MavenProject.java:187)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest4(DaemonGenerationRequestFactory.java:73)
	}

	/**
	 * Run the void setOutputFileNameMapping(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetOutputFileNameMapping_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();
		String outputFileNameMapping = "";

		fixture.setOutputFileNameMapping(outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
	}

	/**
	 * Run the void setPlatform(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetPlatform_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest2();
		String platform = "";

		fixture.setPlatform(platform);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:2001)
		//       at java.io.File.createTempFile(File.java:2070)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest2(DaemonGenerationRequestFactory.java:51)
	}

	/**
	 * Run the void setRepositoryLayout(ArtifactRepositoryLayout) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetRepositoryLayout_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest4();
		ArtifactRepositoryLayout repositoryLayout = new DefaultRepositoryLayout();

		fixture.setRepositoryLayout(repositoryLayout);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.maven.project.MavenProject.deepCopy(MavenProject.java:194)
		//       at org.apache.maven.project.MavenProject.<init>(MavenProject.java:187)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest4(DaemonGenerationRequestFactory.java:73)
	}

	/**
	 * Run the void setStubDaemon(Daemon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetStubDaemon_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest6();
		Daemon stubDaemon = new Daemon();

		fixture.setStubDaemon(stubDaemon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file
		//       at java.io.File.createTempFile(File.java:2018)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest6(DaemonGenerationRequestFactory.java:95)
	}

	/**
	 * Run the void setStubDescriptor(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testSetStubDescriptor_1()
		throws Exception {
		DaemonGenerationRequest fixture = DaemonGenerationRequestFactory.createDaemonGenerationRequest4();
		File stubDescriptor = new File("");

		fixture.setStubDescriptor(stubDescriptor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.maven.project.MavenProject.deepCopy(MavenProject.java:194)
		//       at org.apache.maven.project.MavenProject.<init>(MavenProject.java:187)
		//       at org.codehaus.mojo.appassembler.daemon.DaemonGenerationRequestFactory.createDaemonGenerationRequest4(DaemonGenerationRequestFactory.java:73)
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
		new org.junit.runner.JUnitCore().run(DaemonGenerationRequestTest.class);
	}
}