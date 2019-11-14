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
 * The class <code>DefaultDaemonGeneratorServiceTest</code> contains tests for the class <code>{@link DefaultDaemonGeneratorService}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DefaultDaemonGeneratorServiceTest {
	/**
	 * Run the void generateDaemon(DaemonGenerationRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGenerateDaemon_1()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		DaemonGenerationRequest request = DaemonGenerationRequestFactory.createDaemonGenerationRequest();

		fixture.generateDaemon(request);

		// add additional test code here
	}

	/**
	 * Run the void generateDaemon(String,File,File,MavenProject,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGenerateDaemon_2()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		String platform = "";
		File stubDescriptor = new File("");
		File outputDirectory = new File("");
		MavenProject mavenProject = new MavenProject();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.generateDaemon(platform, stubDescriptor, outputDirectory, mavenProject, localRepository);

		// add additional test code here
	}

	/**
	 * Run the void generateDaemon(String,File,File,MavenProject,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGenerateDaemon_3()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		String platform = "";
		File stubDescriptor = new File("");
		File outputDirectory = new File("");
		MavenProject mavenProject = new MavenProject();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.generateDaemon(platform, stubDescriptor, outputDirectory, mavenProject, localRepository);

		// add additional test code here
	}

	/**
	 * Run the void generateDaemon(String,File,Daemon,File,MavenProject,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGenerateDaemon_4()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		String platform = "";
		File stubDescriptor = new File("");
		Daemon stubDaemon = new Daemon();
		File outputDirectory = new File("");
		MavenProject mavenProject = new MavenProject();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.generateDaemon(platform, stubDescriptor, stubDaemon, outputDirectory, mavenProject, localRepository);

		// add additional test code here
	}

	/**
	 * Run the void generateDaemon(String,File,Daemon,File,MavenProject,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testGenerateDaemon_5()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		String platform = "";
		File stubDescriptor = new File("");
		Daemon stubDaemon = new Daemon();
		File outputDirectory = new File("");
		MavenProject mavenProject = new MavenProject();
		ArtifactRepository localRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.generateDaemon(platform, stubDescriptor, stubDaemon, outputDirectory, mavenProject, localRepository);

		// add additional test code here
	}

	/**
	 * Run the Daemon loadModel(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testLoadModel_1()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		File stubDescriptor = new File("");

		Daemon result = fixture.loadModel(stubDescriptor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon loadModel(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testLoadModel_2()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		File stubDescriptor = new File("");

		Daemon result = fixture.loadModel(stubDescriptor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon loadModel(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testLoadModel_3()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		File stubDescriptor = new File("");

		Daemon result = fixture.loadModel(stubDescriptor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon loadModel(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testLoadModel_4()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		File stubDescriptor = new File("");

		Daemon result = fixture.loadModel(stubDescriptor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon loadModel(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testLoadModel_5()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		File stubDescriptor = new File("");

		Daemon result = fixture.loadModel(stubDescriptor);

		// add additional test code here
		assertNotNull(result);
	}

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
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon dominant = new Daemon();
		Daemon recessive = new Daemon();

		Daemon result = fixture.mergeDaemons(dominant, recessive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.daemon.DefaultDaemonGeneratorService.mergeDaemons(DefaultDaemonGeneratorService.java:148)
		assertNotNull(result);
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
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon dominant = new Daemon();
		Daemon recessive = new Daemon();

		Daemon result = fixture.mergeDaemons(dominant, recessive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.daemon.DefaultDaemonGeneratorService.mergeDaemons(DefaultDaemonGeneratorService.java:148)
		assertNotNull(result);
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_1()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = null;
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_2()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_3()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_4()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_5()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_6()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_7()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_8()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_9()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_10()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_11()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_12()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_13()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_14()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = null;

		fixture.validateDaemon(daemon, descriptor);

		// add additional test code here
	}

	/**
	 * Run the void validateDaemon(Daemon,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testValidateDaemon_15()
		throws Exception {
		DefaultDaemonGeneratorService fixture = DefaultDaemonGeneratorServiceFactory.createDefaultDaemonGeneratorService();
		Daemon daemon = new Daemon();
		daemon.setId("");
		daemon.setMainClass("");
		daemon.setWrapperMainClass("");
		File descriptor = new File("");

		fixture.validateDaemon(daemon, descriptor);

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
		new org.junit.runner.JUnitCore().run(DefaultDaemonGeneratorServiceTest.class);
	}
}