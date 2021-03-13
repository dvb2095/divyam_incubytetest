package incubyte_test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

public class TDD_StringTest_TestIncubyte {
	@Test
	public void checkempty() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(0, prod.Add(""));
	}
	
	@Test
	public void checkonenumber() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(1, prod.Add("1"));
		assertEquals(2, prod.Add("2"));
	}
	
	@Test
	public void checktwonumbers() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(5, prod.Add("2,3"));
		assertEquals(3, prod.Add("1,2"));		
	}
	
	@Test
	public void checkunknownamountofnumbers() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(6, prod.Add("2,2,2"));
		assertEquals(45, prod.Add("1,2,3,4,5,6,7,8,9"));
	}
	
	@Test
	public void checkHandleNewLine() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(6, prod.Add("2,2,\n2"));
		assertEquals(45, prod.Add("1,2,3\n,4,5,\n6,7,8,\n9"));
	}
}
