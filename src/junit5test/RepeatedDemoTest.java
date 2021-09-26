package junit5test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class RepeatedDemoTest {
	/*
	 * Calculator calc;
	 * 
	 * @BeforeEach public void init() { calc=new Calculator(); }
	 */
//	@Test
	@org.junit.jupiter.api.RepeatedTest(3)
	public void repeatedTest() {
		System.out.println("Repeated test started");
	}
	@org.junit.jupiter.api.RepeatedTest(value = 4,name = "{displayName} -repetition - {currentRepetition}/{totalRepetitions}")
	public void repeatedTest1() {
		System.out.println("Repeated test1 started");
	}
	@org.junit.jupiter.api.RepeatedTest(value = 4,name = RepeatedTest.SHORT_DISPLAY_NAME)
//	@org.junit.jupiter.api.RepeatedTest(value = 4,name = RepeatedTest.LONG_DISPLAY_NAME)
	public void repeatedTest2() {
		System.out.println("Repeated test2 started");
	}
	@RepeatedTest(3)
	public void repeatedTest3(RepetitionInfo ri) {
		System.out.println(ri.getCurrentRepetition());
		System.out.println(ri.getTotalRepetitions());
	}
}
