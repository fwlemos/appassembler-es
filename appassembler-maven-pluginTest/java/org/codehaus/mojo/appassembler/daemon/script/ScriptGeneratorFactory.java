package org.codehaus.mojo.appassembler.daemon.script;



/**
 * The class <code>ScriptGeneratorFactory</code> implements static methods that return instances of the class <code>{@link ScriptGenerator}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class ScriptGeneratorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	private ScriptGeneratorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ScriptGenerator}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static ScriptGenerator createcreateDefaultScriptGenerator() {
		return DefaultScriptGeneratorFactory.createDefaultScriptGenerator();
	}
}