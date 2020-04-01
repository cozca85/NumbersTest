package repeatingSequence;

import java.util.ArrayList;

public class Sequence {
	
	public int returnSecondLongestPatternCount(String sequence) {  
		
		int size = 0;
		if(!sequence.trim().isEmpty())
		{
        String lrs=""; 
        int seq = 0;
        ArrayList<String> sequences = new ArrayList<String>();
        int n = sequence.trim().length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring  
                String x = lcp(sequence.substring(i,n),sequence.substring(j,n));  
                //If the current prefix is greater than previous one   
                //then it takes the current one as longest repeating sequence
                // and seq is incremented
                if(x.length() > lrs.length()) 
                	{
                		lrs=x;    
                		seq++;
                		sequences.add(x);
                	}
            }  
        }  
        //System.out.println(lrs.length());
        String longest = sequence.substring(0, 1);
        if  (seq > 0)
        {	
        longest = sequences.get(seq-1);
        }

		//take the longest pattern out of the string
		//create a new string without the longest one 
		//find the longest in the new string
        String newSequence = sequence.replace(longest,"");
        //System.out.println(longest.length());
        int sizeOfLongest = longest.length() + 1;
        //call another method to find the longest recurring pattern
        //in the new string which will enable us to have the 
        //second longest pattern size
        size = returnLongestPatternCount(newSequence,sizeOfLongest);
		}
		return size;
 
    }  
	
	   public static String lcp(String s, String t){ 
		   //Checks for the largest common prefix  
	        int n = Math.min(s.length(),t.length());  
	        for(int i = 0; i < n; i++){  
	            if(s.charAt(i) != t.charAt(i)){  
	                return s.substring(0,i);  
	            }  
	        }  
	        return s.substring(0,n);  
	    }  
	   
	   public int returnLongestPatternCount(String newSequence, int sizeOfLongest) { 
	        String lrs=""; 
	        int n = newSequence.trim().length();  
	        for(int i = 0; i < n; i++){  
	            for(int j = i+1; j < n; j++){  
	                //Checks for the largest common factors in every substring  
	                String x = lcp(newSequence.substring(i,n),newSequence.substring(j,n));  
	                //If the current prefix is greater than previous one   
	                //then it takes the current one as longest repeating sequence
	                if(x.length() > lrs.length() && x.length() < sizeOfLongest - 1 ) 
	                	{
	                		lrs=x;    
	                	}
	            }  
	        } 
	        
	       //System.out.println(lrs.length());
		   int size = lrs.length()+1;
		   return size;
		   
	   }
	   
}
