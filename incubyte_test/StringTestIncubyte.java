package incubyte_test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

public class StringTestIncubyte {
	@Test
	public void checkempty() {
		ProdTestIncubyte prod = new ProdTestIncubyte();
		assertEquals(0, prod.Add(""));
	}
	

}
