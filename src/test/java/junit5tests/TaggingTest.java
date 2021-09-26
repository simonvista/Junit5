package junit5tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggingTest {
	@Test
	@Tag("smoke")
	public void taggingTest1() {
		System.out.println("This is junit test with smoke tag in taggingTest1 method");
	}
	@Test
	@Tag("sanity")
	public void taggingTest2() {
		System.out.println("This is junit test with sanity tag in taggingTest2 method");
	}
	@Test
	@Tag("smoke")
	public void taggingTest3() {
		System.out.println("This is junit test with smoke tag in taggingTest3 method");
	}
	@Test
	@Tag("regression")
	public void taggingTest4() {
		System.out.println("This is junit test with regression tag in taggingTest4 method");
	}
	@Test
	@Tag("regression")
	public void taggingTest5() {
		System.out.println("This is junit test with regression tag in taggingTest5 method");
	}
	@Test
	@Tag("sanity")
	@Tag("regression")
	public void taggingTest6() {
		System.out.println("This is junit test with smoke and regression tag in taggingTest6 method");
	}
}
