package balanceCheck;

import static org.junit.Assert.assertFalse;

/**
 * @author canoz
 *
 */
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class BalanceTests {

	
	@Test
	public void unbalancedTest()
	{
		String unbalanced = "({}{[]})[()] }";
		assertFalse(Balance.isStringBalanced(unbalanced));
	}
	
	@Test
	public void emptyStringTest()
	{
		String unbalanced = "  ";
		assertTrue(Balance.isStringBalanced(unbalanced));
	}
	
	@Test
	public void InvalidStringTest()
	{
		String unbalanced = " asdgfg1231 ";
		assertTrue(Balance.isStringBalanced(unbalanced));
		
	}

}
