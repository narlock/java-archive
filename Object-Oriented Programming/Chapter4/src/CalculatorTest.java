import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
//when the log is green, the code is green B)
	
	@Test
	void testGetSum() {
		double a = 2;
		double b = 3;
		assertEquals(a+b, Calculator.getSum(a,b));
	}

	@Test
	void testGetSubSum() {
		double a = 3, b = 2;
		assertEquals(a-b, Calculator.getSubSum(a,b));
	}

	@Test
	void testGetProduct() {
		double a = 3, b = 2;
		assertEquals(a*b, Calculator.getProduct(a, b));
	}

	@Test
	void testGetQuotient() {
		double a = 4, b = 2;
		assertEquals(a/b, Calculator.getQuotient(a,b));
	}


}
