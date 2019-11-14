package org.codehaus.mojo.appassembler.daemon;

import java.io.File;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.ArtifactRepositoryPolicy;
import org.apache.maven.artifact.repository.DefaultArtifactRepository;
import org.apache.maven.artifact.repository.layout.ArtifactRepositoryLayout;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.artifact.repository.layout.LegacyRepositoryLayout;
import org.apache.maven.model.Model;
import org.apache.maven.project.MavenProject;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.codehaus.plexus.logging.Logger;


/**
 * The class <code>DaemonGenerationRequestFactory</code> implements static methods that return instances of the class <code>{@link DaemonGenerationRequest}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonGenerationRequestFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private DaemonGenerationRequestFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest() {
		return new DaemonGenerationRequest();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest2()
		throws java.io.IOException {
		return new DaemonGenerationRequest(new Daemon(), new MavenProject(), new DefaultArtifactRepository("", "", new DefaultRepositoryLayout()), File.createTempFile("", ""), "");
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest3()
		throws java.io.IOException {
		return new DaemonGenerationRequest(new Daemon(), new MavenProject(new Model(), (Logger) null), new DefaultArtifactRepository("", "", new DefaultRepositoryLayout(), new ArtifactRepositoryPolicy(), (ArtifactRepositoryPolicy) null), File.createTempFile("0123456789", "0123456789"), "An??t-1.0.txt");
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest4()
		throws java.io.IOException {
		return new DaemonGenerationRequest(new Daemon(), new MavenProject((MavenProject) null), new DefaultArtifactRepository("0123456789", "0123456789", new LegacyRepositoryLayout(), (ArtifactRepositoryPolicy) null, (ArtifactRepositoryPolicy) null), File.createTempFile("An??t-1.0.txt", "An??t-1.0.txt", (File) null), (String) null);
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest5()
		throws java.io.IOException {
		return new DaemonGenerationRequest((Daemon) null, new MavenProject(new Model()), new DefaultArtifactRepository("", "", new DefaultRepositoryLayout(), new ArtifactRepositoryPolicy(), new ArtifactRepositoryPolicy()), File.createTempFile("", "", (File) null), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerationRequest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerationRequest createDaemonGenerationRequest6()
		throws java.io.IOException {
		return new DaemonGenerationRequest((Daemon) null, new MavenProject((Model) null, (Logger) null), new DefaultArtifactRepository("0123456789", "0123456789", new LegacyRepositoryLayout()), File.createTempFile("0123456789", "0123456789", (File) null), (String) null);
	}
}