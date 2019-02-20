package softwareHw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
		ShoppingCart cart= new ShoppingCart();
		int act= cart.noOfBooks();
		assertTrue(act==0);
	//	fail("Not yet implemented");
	}
	
	public void test2() {
		 
		ShoppingCart cart1= new ShoppingCart();
		cart1.addBook("JavaBook",127);
		int act1= cart1.noOfBooks();
		assertTrue(act1==1);
		int act2=cart1.totalprice();
		assertTrue(act2==127);
	//	fail("Not yet implemented");
	}
	
	public void test3() 
	{
		ShoppingCart cart2= new ShoppingCart();
		cart2.addBook("JavaBook",127);
		cart2.addBook("Web design page",100);

		int act1= cart2.noOfBooks();
		assertTrue(act1==2);
		int act2=cart2.totalprice();
		assertTrue(act2==227);
	//	fail("Not yet implemented");
	}
	
}
