package org.codehaus.mojo.appassembler.daemon.script;



/**
 * The class <code>PlatformFactory</code> implements static methods that return instances of the class <code>{@link Platform}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class PlatformFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private PlatformFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Platform}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static Platform createPlatform()
		throws org.codehaus.mojo.appassembler.daemon.DaemonGeneratorException {
		return Platform.getInstance("");
	}
}