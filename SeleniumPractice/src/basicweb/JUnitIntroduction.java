package basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executes before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executes after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executes before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executes after test");
	}

	@Test
	public void test1() {
		System.out.println("Executes test 1");
	}
	@Test
	public void test2() {
		System.out.println("Executes test 2");
	}

}
