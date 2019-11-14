package org.codehaus.mojo.appassembler.model;



/**
 * The class <code>DaemonFactory</code> implements static methods that return instances of the class <code>{@link Daemon}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	private DaemonFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Daemon}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	public static Daemon createDaemon() {
		return new Daemon();
	}
}