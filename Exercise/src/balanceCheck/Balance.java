package balanceCheck;

public class Balance {
	
	static int lp = 0;
	static int lc = 0;
	static int ls = 0;

	public static void main(String[] args) {

//		String inputone = "({}{[]})[()]{}";
//		isStringBalanced(inputone);
//		
//		String inputtwo = "[";
//		isStringBalanced(inputtwo);
	}
	
	public static boolean isStringBalanced(String input)
	{
	    // ( = lp count ) 
		// { = lc count } 
		// [ = ls count ]
		
		String inputns = input.trim();
		
		for (int i=0; i < inputns.length(); i++)
	    {
	    	switch (inputns.charAt(i))
	    	{
	    		case '(':
	    			lp = lp + 1;
	    			break;
	    		case ')':
	    			lp = lp - 1;
	    			break;
	    		case '[':
	    			ls = ls + 1;
	    			break;
	    		case ']':
	    			ls = ls - 1;
	    			break;
	    		case '}':
	    			lc = lc + 1;
	    			break;
	    		case '{':
	    			lc = lc - 1;
	    			break;
	    		default :
	    			System.out.println("It is not a valid char");
	    	}
	    }
	    	
	    	if (lp == 0 && ls == 0 && lc == 0)
	    	{
	    		System.out.println("Balance is maintained");
	    		return true;
	    	}
	    	else 
	    	{	
	    		System.out.println("Unbalanced");
	    		return false;
	    	}
		
	}

}
