package DSA.DSAProblems;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
	
	
	
	public int longestSubString(String s) {
		
		int maxValue=Integer.MIN_VALUE;
		
		int left=0;
		
		Set<Character> set = new HashSet<>();
		
		for(int right=0; right<s.length(); right++) {
			
		   if(set.contains(s.charAt(right))) {
			   
			   set.remove(s.charAt(left));
			   left++;
		   }
		   
		   set.add(s.charAt(right));
		   
		   maxValue=Math.max(maxValue, right-left+1);
		  
		}
		 return maxValue;
	}

}
