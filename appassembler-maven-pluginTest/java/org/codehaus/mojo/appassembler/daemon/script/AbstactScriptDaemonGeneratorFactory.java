package org.codehaus.mojo.appassembler.daemon.script;

import org.codehaus.mojo.appassembler.daemon.booter.UnixBooterDaemonGeneratorFactory;
import org.codehaus.mojo.appassembler.daemon.booter.WindowsBooterDaemonGeneratorFactory;


/**
 * The class <code>AbstactScriptDaemonGeneratorFactory</code> implements static methods that return instances of the class <code>{@link AbstactScriptDaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AbstactScriptDaemonGeneratorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private AbstactScriptDaemonGeneratorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link AbstactScriptDaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static AbstactScriptDaemonGenerator createcreateUnixBooterDaemonGenerator() {
		return UnixBooterDaemonGeneratorFactory.createUnixBooterDaemonGenerator();
	}


	/**
	 * Create an instance of the class <code>{@link AbstactScriptDaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static AbstactScriptDaemonGenerator createcreateWindowsBooterDaemonGenerator() {
		return WindowsBooterDaemonGeneratorFactory.createWindowsBooterDaemonGenerator();
	}
}