package junit5test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class BeforeAndAfterTest {
	
	Calculator calc;
	@BeforeAll
	public static void beforeAllMethod(){
		System.out.println("Before running any testing file");
	}	
	@AfterAll 
	public static void afterAllMethod() {
		System.out.println("After running all testing files"); 
	}
	 
	@BeforeEach
	public void init() {
		calc=new Calculator();
	}
	@AfterEach
	public void tearDown() {
		System.out.println("Test method was done successfully");
	}
		
	@Test
	@DisplayName("Add 2 positive ints")
	public void testMethod1() {
	
		int sum=calc.add(10, 20);
		System.out.println("10+20= "+sum);
	}
	@DisplayName("Add 2 negative ints")
	@Test	
//	@Disabled("Not run due to zero never happen")
	public void testMethod2() {

		int sum=calc.add(-20,-30);
		System.out.println("-20-30= "+sum);
	}
	
	
	
}
