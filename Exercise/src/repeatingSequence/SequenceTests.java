package repeatingSequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceTests {
	
	Sequence seq = new Sequence();

	@Test
	public void isSecondLongestSize6Test() {
        String str = "bbbbbccccdddaaaaaaaaaaaaffffffee"; 
        int expectedSize = 6;
        int actualSize = seq.returnSecondLongestPatternCount(str);
        assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void isSecondLongestSize4Test() {
	    String str = "cccccaeeeeebbaaaaee";
        int expectedSize = 4;
        int actualSize = seq.returnSecondLongestPatternCount(str);
        assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void isSecondLongestSize3Test() {
	    String str = "aabbbcwwww";
        int expectedSize = 3;
        int actualSize = seq.returnSecondLongestPatternCount(str);
        assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void isSecondLongestSize1Test() {
	    String str = "cba";
        int expectedSize = 1;
        int actualSize = seq.returnSecondLongestPatternCount(str);
        assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void isSecondLongestSize0Test() {
	    String str = "   ";
        int expectedSize = 0;
        int actualSize = seq.returnSecondLongestPatternCount(str);
        assertEquals(expectedSize, actualSize);
	}

}
