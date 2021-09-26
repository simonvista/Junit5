package junit5test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizationTest {
	/*
	 * @ValueSource
	 * @EnumSource
	 * @MethodSource
	 * @CsvSource
	 * @CsvFileSource
	 * @ArgumentsSource
	 */
//	@ValueSource
	@ParameterizedTest(name = "{index} - run test with args = {0}")
	@ValueSource(ints = {1,5,3,7})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	@ParameterizedTest(name = "{index} -run test with fruit = {0}")
	@ValueSource(strings ={"apple","banana","orange","papaya"} )
	public void valueSourceTest1(String fruit) {
		System.out.println(fruit);
	}
	
//	@EnumSource
	enum Fruits{
		apple,banana,orange,papaya
	}
	@ParameterizedTest
	@EnumSource(Fruits.class)
	public void enumSourceTest(Fruits fruit) {
		System.out.println(fruit);
	}
	
//	@MethodSource
	private static String[] fruits() {
		return new String[] {"apple","banana","orange","papaya"};
	}
	@ParameterizedTest
	@MethodSource("fruits")
	public void methodSourceTest(String fruit) {
		System.out.println(fruit);
	}
	private static Object[] values() {
		return new Object[][] {
				{"java","programming language"},
				{"junit5","unit testing framework"},
				{"selenium","automation api"},
				{"github","repository"}
		};
	}
	@ParameterizedTest
	@MethodSource("values")
	public void methodSourceTest1(String tech,String description) {
		System.out.println(tech+", "+description);
	}
	
//	@CsvSource
	
	@ParameterizedTest
	@CsvSource({
		"java, programming language",
		"junit5, unit testing framework",
		"selenium, automation api",
		"github, repository"
	})
	public void csvSourceTest(String tech,String description) {
		System.out.println(tech+", "+description);
	}
	
}
