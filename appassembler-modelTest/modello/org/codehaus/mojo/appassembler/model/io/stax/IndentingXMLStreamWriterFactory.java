package org.codehaus.mojo.appassembler.model.io.stax;

import javax.xml.stream.XMLStreamWriter;
import com.bea.xml.stream.XMLStreamRecorder;


/**
 * The class <code>IndentingXMLStreamWriterFactory</code> implements static methods that return instances of the class <code>{@link IndentingXMLStreamWriter}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:34 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class IndentingXMLStreamWriterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	private IndentingXMLStreamWriterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IndentingXMLStreamWriter}</code>.
	 *
	 * @generatedBy CodePro at 11/11/19 3:34 AM
	 */
	public static IndentingXMLStreamWriter createIndentingXMLStreamWriter() {
		return new IndentingXMLStreamWriter(new XMLStreamRecorder());
	}
}