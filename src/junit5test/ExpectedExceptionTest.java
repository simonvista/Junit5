package junit5test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ExpectedExceptionTest {
	private int divide(int a,int b) {
		return a/b;
	}
	private void readFile() throws IOException {
		FileInputStream fis=new FileInputStream("./dummy.xls");
		fis.read();
		fis.close();
	}
	@Test
	public void expectedExceptionTest1() {
		assertThrows(ArithmeticException.class, ()->divide(2,1));
//		use assertThrows will run the following code even exception was thrown
		System.out.println("Test passed due to exception was handled");
	}
	@Test
	public void expectedExceptionTest2() {
		assertThrows(ArithmeticException.class, ()->divide(2,0));
		System.out.println("Test passed due to exception was handled");
	}
//	IOException is super type of FileNotFoundException
	@Test
	public void expectedExceptionTest3() {
		assertThrows(FileNotFoundException.class, ()->readFile());
		System.out.println("Test passed due to exception was handled");
	}
	@Test
	public void expectedExceptionTest4() {
		assertThrows(IOException.class, ()->readFile());
		System.out.println("Test passed due to exception was handled");
	}
	
}
