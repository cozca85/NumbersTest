/**
 * 
 */
package primeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

/**
 * @author canoz
 *
 */
public class CheckIfNumberIsPrimeTests {

	@Test
	public void isPrimeNumberTest() {
		// verify a prime number
		assertTrue(CheckIfPrimeNumber.isPrimeNumber(19));
		assertTrue(CheckIfPrimeNumber.isPrimeNumber(104323));
	}
	
	@Test
	public void isPrimeNumberLargeIntegerTest() {
		// verify a large prime integer 
		assertTrue(CheckIfPrimeNumber.isPrimeNumber(328513));
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(165468));
	}
	
	@Test 
	public void isNotAPrimeNumberTest()
	{
		// verify number that is not prime 
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(8));
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(546773255));
	}
	
	@Test 
	public void isZeroAPrimeNumberTest()
	{
		// verify zero is not prime 
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(0));
	}
	
	@Test 
	public void isNegativeIntegerPrimeTest()
	{
		// verify negative number 
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(-8));
		assertTrue(CheckIfPrimeNumber.isPrimeNumber(-7));
	}
	
}
