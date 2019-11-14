package org.codehaus.mojo.appassembler.daemon;

import org.codehaus.mojo.appassembler.daemon.booter.UnixBooterDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.booter.WindowsBooterDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.daemontools.DaemonToolsDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.generic.GenericDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.jsw.JavaServiceWrapperDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.standard.UnixScriptDaemonGenerator;
import org.codehaus.mojo.appassembler.daemon.standard.WindowsScriptDaemonGenerator;


/**
 * The class <code>DaemonGeneratorFactory</code> implements static methods that return instances of the class <code>{@link DaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonGeneratorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private DaemonGeneratorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator() {
		return new UnixBooterDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator2() {
		return new WindowsBooterDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator3() {
		return new DaemonToolsDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator4() {
		return new GenericDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator5() {
		return new JavaServiceWrapperDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator6() {
		return new UnixScriptDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGenerator createDaemonGenerator7() {
		return new WindowsScriptDaemonGenerator();
	}
}