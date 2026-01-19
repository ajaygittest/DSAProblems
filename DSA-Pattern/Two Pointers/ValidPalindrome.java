package DSA.DSAProblems.twoPointers;

public class ValidPalindrome {
	
	
	public boolean validate(String s) {
		
		s=s.toLowerCase();
		s=s.replaceAll("[^a-z0-9]", "");
		
		int left=0;
		int right=s.length()-1;
		
		
		while(left<right) {
			
			if(s.charAt(right) !=s.charAt(left)) {
				
				return false;
				
			}
			left++;
			right--;
		}
		return true;
	}

}
