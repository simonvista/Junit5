package junit5test;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {
//	If junit assumptions fails then test method is skipped.
	@Test
	public void assumeTrueTest() {
		boolean b1=false;
		assumeTrue(b1);
		System.out.println("AssumeTrue passed");
	}
	@Test
	public void assumeFalseTest() {
		boolean b1=false;
		assumeFalse(b1);
		System.out.println("AssumeFalse passed");
	}
}
