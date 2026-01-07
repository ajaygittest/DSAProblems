package DSA.DSAProblems;

public class longestPalindrome {
	
	
	public static void main(String[] args) {
		System.out.println(longPalindrom("dk"));
	}
	
	public static String longPalindrom(String s) {
		
		if(s==null || s.length()<1) {
			return "";
		}
		s="racecar";
		int start=0; 
		int end=0;
		for(int i=0; i<s.length(); i++) {
			
			
			int len1=expandAround(s,i,i);
			int len2=expandAround(s,i,i+1);
			
			int len=Math.max(len1, len2);
			
			
			
			if(len>(end-start)) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		  return s.substring(start, end + 1);
	}

	private static int expandAround(String s, int left, int right) {
		
		while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)) {
			
			left--;
			right++;
		}
		
		return right-left-1;
	}

}
