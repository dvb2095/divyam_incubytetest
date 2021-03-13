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
}
