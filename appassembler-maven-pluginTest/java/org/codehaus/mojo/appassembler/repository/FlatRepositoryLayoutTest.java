package org.codehaus.mojo.appassembler.repository;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.apache.maven.artifact.handler.DefaultArtifactHandler;
import org.apache.maven.artifact.metadata.ArtifactMetadata;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.DefaultArtifactRepository;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.artifact.versioning.VersionRange;
import org.apache.maven.project.artifact.ProjectArtifactMetadata;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FlatRepositoryLayoutTest</code> contains tests for the class <code>{@link FlatRepositoryLayout}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class FlatRepositoryLayoutTest {
	/**
	 * Run the FlatRepositoryLayout() constructor test.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testFlatRepositoryLayout_1()
		throws Exception {
		FlatRepositoryLayout result = new FlatRepositoryLayout();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String pathOf(Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathOf_1()
		throws Exception {
		FlatRepositoryLayout fixture = FlatRepositoryLayoutFactory.createFlatRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = fixture.pathOf(artifact);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathOf(Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathOf_2()
		throws Exception {
		FlatRepositoryLayout fixture = FlatRepositoryLayoutFactory.createFlatRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = fixture.pathOf(artifact);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathOf(Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathOf_3()
		throws Exception {
		FlatRepositoryLayout fixture = FlatRepositoryLayoutFactory.createFlatRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = fixture.pathOf(artifact);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathOfLocalRepositoryMetadata(ArtifactMetadata,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathOfLocalRepositoryMetadata_1()
		throws Exception {
		FlatRepositoryLayout fixture = FlatRepositoryLayoutFactory.createFlatRepositoryLayout();
		ArtifactMetadata metadata = new ProjectArtifactMetadata(new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler()));
		ArtifactRepository repository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		String result = fixture.pathOfLocalRepositoryMetadata(metadata, repository);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathOfRemoteRepositoryMetadata(ArtifactMetadata) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathOfRemoteRepositoryMetadata_1()
		throws Exception {
		FlatRepositoryLayout fixture = FlatRepositoryLayoutFactory.createFlatRepositoryLayout();
		ArtifactMetadata metadata = new ProjectArtifactMetadata(new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler()));

		String result = fixture.pathOfRemoteRepositoryMetadata(metadata);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
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
		new org.junit.runner.JUnitCore().run(FlatRepositoryLayoutTest.class);
	}
}