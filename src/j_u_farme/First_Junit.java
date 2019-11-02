package j_u_farme;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class First_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is BeforeClass method");
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is AfterClass method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is Before Method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is After method");
	}

	@Test
	public void test() {
		System.out.println("This is Test Method");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2 method");
		
	}

}
