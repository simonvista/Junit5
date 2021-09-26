package junit5test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestExecutionOrderTest {
//	By default, test runs in alphabetical order
	@Test
	@Order(4)
	public void test1() {
		System.out.println("Test 1 started");
	}
	@Test
	@Order(3)
	public void test2() {
		System.out.println("Test 2 started");
	}
	@Test
	@Order(2)
	public void test3() {
		System.out.println("Test 3 started");
	}
	@Test
	@Order(1)
	public void test4() {
		System.out.println("Test 4 started");
	}
}
