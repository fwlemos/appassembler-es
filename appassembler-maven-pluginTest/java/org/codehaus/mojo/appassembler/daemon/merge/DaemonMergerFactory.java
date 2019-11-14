package org.codehaus.mojo.appassembler.daemon.merge;



/**
 * The class <code>DaemonMergerFactory</code> implements static methods that return instances of the class <code>{@link DaemonMerger}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class DaemonMergerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private DaemonMergerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DaemonMerger}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static DaemonMerger createcreateDefaultDaemonMerger() {
		return DefaultDaemonMergerFactory.createDefaultDaemonMerger();
	}
}