import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepositCalculatorTest {

	@Test
	public void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(35000.0 , 11.0, 3);
		assertEquals(46550, result,0);
	}


	@Test
	public void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(16000.0 , 5.0, 3);
		assertEquals(18400, result,0);
	}
}
