package org.codehaus.mojo.appassembler.util;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.apache.maven.artifact.handler.DefaultArtifactHandler;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.artifact.versioning.VersionRange;
import org.apache.maven.project.MavenProject;
import org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException;
import org.codehaus.mojo.appassembler.model.Dependency;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DependencyFactoryTest</code> contains tests for the class <code>{@link DependencyFactory}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DependencyFactoryTest {
	/**
	 * Run the Dependency create(Artifact,ArtifactRepositoryLayout,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(artifact, layout, outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(Artifact,ArtifactRepositoryLayout,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(artifact, layout, outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(Artifact,ArtifactRepositoryLayout,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		boolean useTimestampInSnapshotFileName = false;
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(artifact, layout, useTimestampInSnapshotFileName, outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(Artifact,ArtifactRepositoryLayout,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreate_4()
		throws Exception {
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		boolean useTimestampInSnapshotFileName = true;
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(artifact, layout, useTimestampInSnapshotFileName, outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(Artifact,ArtifactRepositoryLayout,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreate_5()
		throws Exception {
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		boolean useTimestampInSnapshotFileName = true;
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(artifact, layout, useTimestampInSnapshotFileName, outputFileNameMapping);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(MavenProject,String,ArtifactRepositoryLayout,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreate_6()
		throws Exception {
		MavenProject project = new MavenProject();
		String id = "";
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(project, id, layout, outputFileNameMapping);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Dependency create(MavenProject,String,ArtifactRepositoryLayout,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test(expected = org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException.class)
	public void testCreate_7()
		throws Exception {
		MavenProject project = new MavenProject();
		String id = "";
		ArtifactRepositoryLayout layout = new DefaultRepositoryLayout();
		String outputFileNameMapping = "";

		Dependency result = DependencyFactory.create(project, id, layout, outputFileNameMapping);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DependencyFactoryTest.class);
	}
}