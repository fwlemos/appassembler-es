package org.codehaus.mojo.appassembler.util;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.apache.maven.artifact.handler.DefaultArtifactHandler;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.artifact.versioning.VersionRange;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ArtifactUtilsTest</code> contains tests for the class <code>{@link ArtifactUtils}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class ArtifactUtilsTest {
	/**
	 * Run the String pathBaseVersionOf(ArtifactRepositoryLayout,Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathBaseVersionOf_1()
		throws Exception {
		ArtifactRepositoryLayout artifactRepositoryLayout = new DefaultRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = ArtifactUtils.pathBaseVersionOf(artifactRepositoryLayout, artifact);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathBaseVersionOf(ArtifactRepositoryLayout,Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathBaseVersionOf_2()
		throws Exception {
		ArtifactRepositoryLayout artifactRepositoryLayout = new DefaultRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = ArtifactUtils.pathBaseVersionOf(artifactRepositoryLayout, artifact);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
		assertNotNull(result);
	}

	/**
	 * Run the String pathBaseVersionOf(ArtifactRepositoryLayout,Artifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testPathBaseVersionOf_3()
		throws Exception {
		ArtifactRepositoryLayout artifactRepositoryLayout = new DefaultRepositoryLayout();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());

		String result = ArtifactUtils.pathBaseVersionOf(artifactRepositoryLayout, artifact);

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
		new org.junit.runner.JUnitCore().run(ArtifactUtilsTest.class);
	}
}