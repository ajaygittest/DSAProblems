package DSA.DSAProblems;

public class ValidAnagram {
	
	
	public boolean isAnagram(String s, String t) {
		
		
		if(s.length() != t.length()) {
			return false;
			
		}
		
		
		int[] result=new int[26];
		
		for(char c:s.toCharArray()) {
			
			result[c-'a']++;
		}
		
		for(char c:t.toCharArray()) {
			
			result[c-'a']++;
		}
		
		for(int n : result) {
			if(n!=0) {
				return false;
			}
		}
		return true;
	}

}
