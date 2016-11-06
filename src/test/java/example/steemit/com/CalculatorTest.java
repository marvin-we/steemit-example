package example.steemit.com;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void addTwoNumbersTest() {
		assertEquals(2, Calculator.add(1, 1));
	}
	
	@Test
	public void addTwoFloatingNumbersTest() {
		assertEquals(2, Calculator.add(1.0, 1.0));
	}
}
