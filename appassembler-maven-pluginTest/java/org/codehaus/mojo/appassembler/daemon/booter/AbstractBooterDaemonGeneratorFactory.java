package org.codehaus.mojo.appassembler.daemon.booter;



/**
 * The class <code>AbstractBooterDaemonGeneratorFactory</code> implements static methods that return instances of the class <code>{@link AbstractBooterDaemonGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AbstractBooterDaemonGeneratorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private AbstractBooterDaemonGeneratorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link AbstractBooterDaemonGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static AbstractBooterDaemonGenerator createcreateUnixBooterDaemonGenerator() {
		return UnixBooterDaemonGeneratorFactory.createUnixBooterDaemonGenerator();
	}
}