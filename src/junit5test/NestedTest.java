package junit5test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import junit5classes.Calculator;

public class NestedTest {
	Calculator calc;
	@BeforeEach
	public void init() {
		calc=new Calculator();
	}
	@Nested
	class addPositiveNums{
		@Test
		public void addSmallPositiveNums() {
			int sum=calc.add(2, 3);
			System.out.println("Sum_sp= "+sum);
		}
		@Test
		public void addBigPositiveNums() {
			int sum=calc.add(2000, 300);
			System.out.println("Sum_bp= "+sum);
		}
	}
	@Nested
	class addNegativeNums{
		@Test
		public void addSmallNegativeNums() {
			int sum=calc.add(-2, -3);
			System.out.println("Sum_sn= "+sum);
		}
		@Test
		public void addBigNegativeNums() {
			int sum=calc.add(-2000, -300);
			System.out.println("Sum_bn= "+sum);
		}
	}
	@Nested
	class addZeroNums{
		@Test
		public void addPositiveZeroNums() {
			int sum=calc.add(0, 0);
			System.out.println("Sum_pz= "+sum);
		}	
		@Test
		public void addNegativeZeroNums() {
			int sum=calc.add(-0, -0);
			System.out.println("Sum_nz= "+sum);
		}
	}	
	
}
