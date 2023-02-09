package org.lesson.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lessons.java.calculator.Calculator;

public class CalculatorTest {
	static Calculator calculator ;
	
	@BeforeAll
	static void initCalculator() {
		calculator= new Calculator();
	}
	
	@Test
	@DisplayName("Test metodo ADD")
	public void testAdd() {
		float result = calculator.add(12,1);
		assertEquals(result, 13);
	}
	
	@Test
	@DisplayName("Test metodo SUBTRACT")
	public void testSubtract() {
		float result = calculator.subtract(8, 5);
		assertEquals(result, 3);
	}
	
	@Test
	@DisplayName("Test metodo DIVIDE")
	public void testDivide() throws Exception {
		float result = calculator.divide(25, 5);
		assertEquals(result, 5);
	}
	@Test
	@DisplayName("Test divisione per 0")
	void testDivisionException(){
		
		assertThrows(Exception.class, () -> calculator.divide(1, 0));
	}
	
	@Test
	@DisplayName("Test metodo MULTIPLY")
	public void testMultiply() {
		float result = calculator.multiply(10, 4);
		assertEquals(result, 175);
	}
	
	
	
}
