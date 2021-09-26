package junit5test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class AssertionsTest {
//	If JUnit assert fails, the test fails
	Calculator calc;		 
	@BeforeEach
	public void init() {
		calc=new Calculator();
	}
	@Test
	public void assertEqualsTest() {
		int sum=calc.add(2, 2);
		assertEquals(4, sum,"Test Failed due to expexted!=actual");		//if expexted!=actual -> "..." will be output at Failure Trace
	}
	@Test
	public void assertNotEqualsTest() {
		int sum=calc.add(2, 2);
		assertNotEquals(4, sum,"Test Passed due to expexted==actual");		//if expexted==actual -> "..." will be output at Failure Trace
	}
	@Test
	public void assertArrayEqualsTest() {
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3,4});
//		assertArrayEquals(new int[] {1,2,3}, new int[] {3,2,1});
//		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}
	@Test
	public void assertNullTest() {
		String nullString=null;
		assertNull(nullString);		
	}
	@Test
	public void assertNotNullTest() {
		String str="JUnit 5";
		assertNotNull(str);		
	}
	@Test
	public void assertTrueTest() {
		boolean b1=true;
		assertTrue(b1);
	}
	@Test
	public void assertFalseTest() {
		boolean b1=true;
		assertFalse(b1,"Test failed because b1 is true");		
	}
}
