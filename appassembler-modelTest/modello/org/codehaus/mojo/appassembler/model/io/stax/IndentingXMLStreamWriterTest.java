package org.codehaus.mojo.appassembler.model.io.stax;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import javanet.staxutils.EmptyNamespaceContext;
import javanet.staxutils.io.StAXStreamWriter;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamWriter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IndentingXMLStreamWriterTest</code> contains tests for the class <code>{@link IndentingXMLStreamWriter}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class IndentingXMLStreamWriterTest {
	/**
	 * Run the IndentingXMLStreamWriter(XMLStreamWriter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testIndentingXMLStreamWriter_1()
		throws Exception {
		XMLStreamWriter out = new IndentingXMLStreamWriter(new StAXStreamWriter(new ByteArrayOutputStream()));

		IndentingXMLStreamWriter result = new IndentingXMLStreamWriter(out);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getNamespaceContext());
		assertEquals("\r\n", result.getLineSeparator());
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testFlush_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testFlush_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.flush();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the String getLineSeparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetLineSeparator_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		String result = fixture.getLineSeparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the NamespaceContext getNamespaceContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetNamespaceContext_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		NamespaceContext result = fixture.getNamespaceContext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetPrefix_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String uri = "";

		String result = fixture.getPrefix(uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetPrefix_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String uri = "";

		String result = fixture.getPrefix(uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Object getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetProperty_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String name = "";

		Object result = fixture.getProperty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Object getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testGetProperty_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String name = "";

		Object result = fixture.getProperty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the void setDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetDefaultNamespace_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String uri = "";

		fixture.setDefaultNamespace(uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetDefaultNamespace_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String uri = "";

		fixture.setDefaultNamespace(uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setNamespaceContext(NamespaceContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetNamespaceContext_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		NamespaceContext context = new EmptyNamespaceContext();

		fixture.setNamespaceContext(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setNamespaceContext(NamespaceContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetNamespaceContext_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		NamespaceContext context = new EmptyNamespaceContext();

		fixture.setNamespaceContext(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setNewLine(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetNewLine_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String newLine = "";

		fixture.setNewLine(newLine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setPrefix(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetPrefix_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String uri = "";

		fixture.setPrefix(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void setPrefix(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testSetPrefix_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String uri = "";

		fixture.setPrefix(prefix, uri);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";
		String value = "";

		fixture.writeAttribute(localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";
		String value = "";

		fixture.writeAttribute(localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(namespaceURI, localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(namespaceURI, localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_5()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(prefix, namespaceURI, localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteAttribute_6()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(prefix, namespaceURI, localName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCData(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCData_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String data = "";

		fixture.writeCData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCData(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCData_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String data = "";

		fixture.writeCData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCharacters(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCharacters_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String text = "";

		fixture.writeCharacters(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCharacters(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCharacters_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String text = "";

		fixture.writeCharacters(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCharacters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCharacters_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		char[] text = new char[] {};
		int start = 1;
		int len = 1;

		fixture.writeCharacters(text, start, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeCharacters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteCharacters_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		char[] text = new char[] {};
		int start = 1;
		int len = 1;

		fixture.writeCharacters(text, start, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteComment_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String data = "";

		fixture.writeComment(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteComment_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String data = "";

		fixture.writeComment(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeDTD(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteDTD_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String dtd = "";

		fixture.writeDTD(dtd);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeDTD(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteDTD_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String dtd = "";

		fixture.writeDTD(dtd);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteDefaultNamespace_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";

		fixture.writeDefaultNamespace(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteDefaultNamespace_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";

		fixture.writeDefaultNamespace(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";

		fixture.writeEmptyElement(localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";

		fixture.writeEmptyElement(localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_5()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(prefix, namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEmptyElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEmptyElement_6()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(prefix, namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEndDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEndDocument_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeEndDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEndDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEndDocument_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeEndDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEndElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEndElement_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeEndElement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEndElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEndElement_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeEndElement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEntityRef(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEntityRef_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String name = "";

		fixture.writeEntityRef(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeEntityRef(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteEntityRef_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String name = "";

		fixture.writeEntityRef(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeNamespace(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteNamespace_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";

		fixture.writeNamespace(prefix, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeNamespace(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteNamespace_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String namespaceURI = "";

		fixture.writeNamespace(prefix, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeProcessingInstruction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteProcessingInstruction_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String target = "";

		fixture.writeProcessingInstruction(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeProcessingInstruction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteProcessingInstruction_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String target = "";

		fixture.writeProcessingInstruction(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeProcessingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteProcessingInstruction_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String target = "";
		String data = "";

		fixture.writeProcessingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeProcessingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteProcessingInstruction_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String target = "";
		String data = "";

		fixture.writeProcessingInstruction(target, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeStartDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();

		fixture.writeStartDocument();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String version = "";

		fixture.writeStartDocument(version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String version = "";

		fixture.writeStartDocument(version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_5()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String encoding = "";
		String version = "";

		fixture.writeStartDocument(encoding, version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartDocument_6()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String encoding = "";
		String version = "";

		fixture.writeStartDocument(encoding, version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_1()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";

		fixture.writeStartElement(localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_2()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String localName = "";

		fixture.writeStartElement(localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_3()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";

		fixture.writeStartElement(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_4()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String namespaceURI = "";
		String localName = "";

		fixture.writeStartElement(namespaceURI, localName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_5()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeStartElement(prefix, localName, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Run the void writeStartElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test
	public void testWriteStartElement_6()
		throws Exception {
		IndentingXMLStreamWriter fixture = IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter();
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeStartElement(prefix, localName, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Error: Unresolved compilation problem: 
		//       XMLStreamRecorder cannot be resolved to a type
		//       
		//       at org.codehaus.mojo.appassembler.model.io.stax.IndentingXMLStreamWriterFactory.createIndentingXMLStreamWriter(IndentingXMLStreamWriterFactory.java:31)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IndentingXMLStreamWriterTest.class);
	}
}