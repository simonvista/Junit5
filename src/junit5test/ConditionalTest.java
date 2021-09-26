package junit5test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	/*
	 * 1. Condition on OS
	 * 2. Condition on particular JRE
	 * 3. Condition on JRE range
	 * 4. Condition on system property
	 */
//	1.
	@Test
	@EnabledOnOs(OS.WINDOWS )
	public void conditionOnOS() {
		System.out.println("Run the test only in Windows machine");
	}
//	2.
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	public void conditionOnJRE() {
		System.out.println("Run the test on JRE 8");
	}
//	3.
	@Test
	@EnabledForJreRange(min = JRE.JAVA_8,max = JRE.JAVA_12)
	public void conditionOnJRERange() {
		System.out.println("Run test on JRE range 8-12");
	}
//	4.
	@Test
	@EnabledIfSystemProperty(named = "user.dir", matches = "C:/Users/YL/Desktop/Tutorials/Junit/Junit5/KrishnaSakinala/tutorial" )
	public void conditionOnSystemproperty() {
		System.out.println(System.getProperty("user.dir"));		//C:\Users\YL\Desktop\Tutorials\Junit\Junit5\KrishnaSakinala\tutorial2
	}
	
}
