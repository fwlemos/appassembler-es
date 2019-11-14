package org.codehaus.mojo.appassembler;

import java.io.File;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.apache.maven.artifact.handler.DefaultArtifactHandler;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.DefaultArtifactRepository;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.artifact.versioning.VersionRange;
import org.codehaus.plexus.context.Context;
import org.codehaus.plexus.context.ContextException;
import org.codehaus.plexus.context.DefaultContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractAppAssemblerMojoTest</code> contains tests for the class <code>{@link AbstractAppAssemblerMojo}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AbstractAppAssemblerMojoTest {
	/**
	 * Run the void contextualize(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.plexus.context.ContextException.class)
	public void testContextualize_1()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Context context = new DefaultContext();

		fixture.contextualize(context);

		// add additional test code here
	}

	/**
	 * Run the void contextualize(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test(expected = org.codehaus.plexus.context.ContextException.class)
	public void testContextualize_2()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Context context = new DefaultContext();

		fixture.contextualize(context);

		// add additional test code here
	}

	/**
	 * Run the ArtifactRepositoryLayout getArtifactRepositoryLayout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetArtifactRepositoryLayout_1()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();

		ArtifactRepositoryLayout result = fixture.getArtifactRepositoryLayout();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.AbstractAppAssemblerMojo.getArtifactRepositoryLayout(AbstractAppAssemblerMojo.java:151)
		assertNotNull(result);
	}

	/**
	 * Run the ArtifactRepositoryLayout getArtifactRepositoryLayout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetArtifactRepositoryLayout_2()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();

		ArtifactRepositoryLayout result = fixture.getArtifactRepositoryLayout();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.AbstractAppAssemblerMojo.getArtifactRepositoryLayout(AbstractAppAssemblerMojo.java:151)
		assertNotNull(result);
	}

	/**
	 * Run the ArtifactRepositoryLayout getArtifactRepositoryLayout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testGetArtifactRepositoryLayout_3()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();

		ArtifactRepositoryLayout result = fixture.getArtifactRepositoryLayout();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.codehaus.mojo.appassembler.AbstractAppAssemblerMojo.getArtifactRepositoryLayout(AbstractAppAssemblerMojo.java:151)
		assertNotNull(result);
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_1()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.installArtifact(artifact, artifactRepository);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_2()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());

		fixture.installArtifact(artifact, artifactRepository);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_3()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_4()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_5()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_6()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = false;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_7()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_8()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_9()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_10()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_11()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = false;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_12()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = false;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_13()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_14()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_15()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_16()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_17()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = null;
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
	}

	/**
	 * Run the void installArtifact(Artifact,ArtifactRepository,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testInstallArtifact_18()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		Artifact artifact = new DefaultArtifact("", "", VersionRange.createFromVersion(""), "", "", "", new DefaultArtifactHandler());
		ArtifactRepository artifactRepository = new DefaultArtifactRepository("", "", new DefaultRepositoryLayout());
		boolean useTimestampInSnapshotFileName = true;

		fixture.installArtifact(artifact, artifactRepository, useTimestampInSnapshotFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.maven.artifact.InvalidArtifactRTException: For artifact {:::}: The groupId cannot be empty.
		//       at org.apache.maven.artifact.DefaultArtifact.validateIdentity(DefaultArtifact.java:129)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:122)
		//       at org.apache.maven.artifact.DefaultArtifact.<init>(DefaultArtifact.java:93)
	}

	/**
	 * Run the void removeDirectory(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testRemoveDirectory_1()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		File directory = new File("");

		fixture.removeDirectory(directory);

		// add additional test code here
	}

	/**
	 * Run the void removeDirectory(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testRemoveDirectory_2()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		File directory = new File("");

		fixture.removeDirectory(directory);

		// add additional test code here
	}

	/**
	 * Run the void removeDirectory(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	@Test
	public void testRemoveDirectory_3()
		throws Exception {
		AbstractAppAssemblerMojo fixture = AbstractAppAssemblerMojoFactory.createcreateCreateRepositoryMojo();
		File directory = new File("");

		fixture.removeDirectory(directory);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractAppAssemblerMojoTest.class);
	}
}