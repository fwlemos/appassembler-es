package org.codehaus.mojo.appassembler.daemon;



/**
 * The class <code>DaemonGeneratorExceptionFactory</code> implements static methods that return instances of the class <code>{@link DaemonGeneratorException}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonGeneratorExceptionFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private DaemonGeneratorExceptionFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGeneratorException}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGeneratorException createDaemonGeneratorException() {
		return new DaemonGeneratorException("");
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGeneratorException}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGeneratorException createDaemonGeneratorException2() {
		return new DaemonGeneratorException("", new Throwable(""));
	}


	/**
	 * Create an instance of the class <code>{@link DaemonGeneratorException}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonGeneratorException createDaemonGeneratorException3() {
		return new DaemonGeneratorException("0123456789", new Throwable("", (Throwable) null));
	}
}