package org.codehaus.mojo.appassembler.model.io.stax;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import javax.xml.stream.XMLStreamException;
import org.codehaus.mojo.appassembler.model.Daemon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AppassemblerModelStaxReaderTest</code> contains tests for the class <code>{@link AppassemblerModelStaxReader}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:35 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class AppassemblerModelStaxReaderTest {
	/**
	 * Run the Daemon read(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_1()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();

		Daemon result = fixture.read(stream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_2()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();

		Daemon result = fixture.read(stream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_3()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();

		Daemon result = fixture.read(stream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_4()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();

		Daemon result = fixture.read(reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_5()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();

		Daemon result = fixture.read(reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_6()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();

		Daemon result = fixture.read(reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_7()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";

		Daemon result = fixture.read(filePath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_8()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";

		Daemon result = fixture.read(filePath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_9()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";

		Daemon result = fixture.read(filePath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_10()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();
		boolean strict = true;

		Daemon result = fixture.read(stream, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_11()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();
		boolean strict = true;

		Daemon result = fixture.read(stream, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_12()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();
		boolean strict = true;

		Daemon result = fixture.read(stream, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_13()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();
		boolean strict = true;

		Daemon result = fixture.read(stream, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(InputStream,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_14()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		InputStream stream = new PipedInputStream();
		boolean strict = true;

		Daemon result = fixture.read(stream, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_15()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();
		boolean strict = true;

		Daemon result = fixture.read(reader, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_16()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();
		boolean strict = true;

		Daemon result = fixture.read(reader, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_17()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();
		boolean strict = true;

		Daemon result = fixture.read(reader, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_18()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();
		boolean strict = true;

		Daemon result = fixture.read(reader, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(Reader,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testRead_19()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		Reader reader = new PipedReader();
		boolean strict = true;

		Daemon result = fixture.read(reader, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_20()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_21()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_22()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_23()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_24()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_25()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Daemon read(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:35 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRead_26()
		throws Exception {
		AppassemblerModelStaxReader fixture = AppassemblerModelStaxReaderFactory.createAppassemblerModelStaxReader();
		String filePath = "";
		boolean strict = true;

		Daemon result = fixture.read(filePath, strict);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AppassemblerModelStaxReaderTest.class);
	}
}