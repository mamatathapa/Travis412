package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
@Test
	public void testAdd1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, -1), 0);
	}
	
	@Test
	public void testAdd2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(-2, -1), -3);
	}
	
	@Test
	public void testAdd3() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(-2, 1), -1);
	}
	
	@Test
	public void testAdd4() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(0, 0), 0);
	}
	
	@Test
	public void testAdd5() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(111111111, 22222222), 133333333);
	}
	
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(1, 1), 0);
	}
	
	@Test
	public void testMinus1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(-1, -1), 0);
	}
	
	@Test
	public void testMinus2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(-1, 3), -4);
	}
	@Test
	public void testMinus3() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(-3, 2), -5);
	}
	
	@Test
	public void testMinus4() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(3, 2), 1);
	}
	
	@Test
	public void testMinus5() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(0, 0), 0);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(0, 0), 0);
	}
	
	@Test
	public void testMultiply1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 0), 0);
	}
	
	@Test
	public void testMultiply2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(0, 1), 0);
	}
	
	@Test
	public void testMultiply3() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(4, 5), 20);
	}
	
	@Test
	public void testMultiply4() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(3, 2), 6);
	}
	@Test
	public void testMultiply5() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(-2,-3),6);
	}
	@Test
	public void testMultiply6() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(-2,3),-6);
	}
	@Test
	public void testMultiply7() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2,-3),-6);
	}
	
	
	@Test
	public void testdivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (0,0), 0);
	}
	
	@Test
	public void testdivide1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (1,0), 0);
	}
	
	@Test
	public void testdivide2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (0,1), 0);
	}
	
	@Test
	public void testdivide3() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (2,2), 1);
	}
	@Test
	public void testdivide4() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (4,-2),-2);
	}
	@Test
	public void testdivide5() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (-4,2),-2);
	}
	@Test
	public void testdivide6() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (-4,-2),2);
	}
	@Test
	public void testdivide7() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (2,4),0);
	}
	
	@Test
	public void testdivide8() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide (8,4),2);
	}

}
