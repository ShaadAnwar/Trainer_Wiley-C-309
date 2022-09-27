import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddSubTest {

	@Test
	public void testAdd() {
		assertEquals("error in add()", 3, Calculator.add(1, 2));
		//assertEquals("errormessage", expectedValue, actualValue);
		assertEquals("error in add()", 30, Calculator.add(10, 20));
		assertEquals("error in add()", 1, Calculator.add(1, 20));
		
		
		//assert
		
		
	}
	//TDD: Test Driven Development : practice in Extreme Programming
	//Write Test-> Fail First->Write fully tested code 
	@Test
	public void testAvg() {
		
		assertEquals("error in add",5,Calculator.avg(new int[] {5,5,5}));
		assertEquals("error in add",7,Calculator.avg(new int[] {7,7,7}));
		
	}
	
}
