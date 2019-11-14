package org.codehaus.mojo.appassembler.util;

import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FileFilterHelperTest</code> contains tests for the class <code>{@link FileFilterHelper}</code>.
 *
 * @generatedBy CodePro at 11/11/19 3:33 AM
 * @author Filipe
 * @version $Revision: 1.0 $
 */
public class FileFilterHelperTest {
	/**
	 * Run the IOFileFilter createDefaultFilter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testCreateDefaultFilter_1()
		throws Exception {

		IOFileFilter result = FileFilterHelper.createDefaultFilter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IOFileFilter makeDirectoryAware(IOFileFilter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMakeDirectoryAware_1()
		throws Exception {
		IOFileFilter filter = new AndFileFilter();
		String directoryName = "";

		IOFileFilter result = FileFilterHelper.makeDirectoryAware(filter, directoryName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IOFileFilter makeFileNameAware(IOFileFilter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMakeFileNameAware_1()
		throws Exception {
		IOFileFilter filter = new AndFileFilter();
		String fileName = "";

		IOFileFilter result = FileFilterHelper.makeFileNameAware(filter, fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IOFileFilter makePatternFileNameAware(IOFileFilter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMakePatternFileNameAware_1()
		throws Exception {
		IOFileFilter filter = new AndFileFilter();
		String pattern = "";

		IOFileFilter result = FileFilterHelper.makePatternFileNameAware(filter, pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IOFileFilter makeSuffixAware(IOFileFilter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	@Test
	public void testMakeSuffixAware_1()
		throws Exception {
		IOFileFilter filter = new AndFileFilter();
		String suffixFileName = "";

		IOFileFilter result = FileFilterHelper.makeSuffixAware(filter, suffixFileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/11/19 3:33 AM
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
	 * @generatedBy CodePro at 11/11/19 3:33 AM
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
	 * @generatedBy CodePro at 11/11/19 3:33 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FileFilterHelperTest.class);
	}
}