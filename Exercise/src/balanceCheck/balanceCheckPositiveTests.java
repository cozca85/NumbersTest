package balanceCheck;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class balanceCheckPositiveTests {

	@Test
	public void balancedPositiveTest()
	{
		String balanced = "({}{[]})[()]{}";
		assertTrue(Balance.isStringBalanced(balanced));
		
	}
	
	
}
