package DSA.DSAProblems.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	
	
	
	public int lenOfSubArray(String s) {
		
		
		Set<Character> set = new HashSet<>();
		
		int left=0;
		int n=s.length();
		int maxLen=0;
		
		for(int right=0; right<n; right++) {
			
			while(set.contains(s.charAt(right))) {
				
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(s.charAt(right));
			
			maxLen=Math.max(maxLen, right-left+1);
			
		}
		return maxLen;
	}

}
