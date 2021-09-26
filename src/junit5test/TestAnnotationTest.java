package junit5test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

//@Disabled("Not run due to tested function isn't finished updating")
public class TestAnnotationTest {
	@Test
	@DisplayName("Add 2 positive ints")
	public void testMethod1() {
		Calculator calc=new	Calculator();
		int sum=calc.add(10, 20);
		System.out.println("10+20= "+sum);
	}
	@DisplayName("Add 2 negative ints")
	@Test	
	public void testMethod2() {
		Calculator calc=new Calculator();
		int sum=calc.add(-20,-30);
		System.out.println("-20-30= "+sum);
	}
	@Test
	@DisplayName("One of ints is zero")
	@Disabled("Not run due to zero never happen")
	public void testMethod3() {
		Calculator calc=new Calculator();
		int sum=calc.add(0,-30);
		System.out.println("0-30= "+sum);
	}
}
