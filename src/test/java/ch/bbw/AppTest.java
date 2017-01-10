package ch.bbw;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void testSummeZweiPositive() {
		int number1 = 5;
		int number2 = 7;
		
		Calculator calculator = new Calculator();
		assertEquals(12, calculator.addition(number1, number2));
	}
	
	@Test
	public void testSummeZweiNegative() {
		int number1 = -5;
		int number2 = -7;
		
		Calculator calculator = new Calculator();
		assertEquals(-12, calculator.addition(number1, number2));
	}
	
	@Test
	public void testSummeZweiNull() {
		int number = 0;
		
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.addition(number, number));
	}

}