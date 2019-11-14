package org.codehaus.mojo.appassembler.daemon;

import org.codehaus.mojo.appassembler.daemon.generic.GenericDaemonGeneratorTest;
import org.codehaus.mojo.appassembler.daemon.jsw.JavaServiceWrapperDaemonGeneratorTest;


/**
 * The class <code>AbstractDaemonGeneratorTestFactory</code> implements static methods that return instances of the class <code>{@link AbstractDaemonGeneratorTest}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AbstractDaemonGeneratorTestFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private AbstractDaemonGeneratorTestFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link AbstractDaemonGeneratorTest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static AbstractDaemonGeneratorTest createAbstractDaemonGeneratorTest() {
		return new GenericDaemonGeneratorTest();
	}


	/**
	 * Create an instance of the class <code>{@link AbstractDaemonGeneratorTest}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static AbstractDaemonGeneratorTest createAbstractDaemonGeneratorTest2() {
		return new JavaServiceWrapperDaemonGeneratorTest();
	}
}