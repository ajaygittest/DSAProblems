package Own;

import java.util.Arrays;

public class ArraySubset {
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static boolean findSubSet(int[]a,int[]b) {
		
		if(a.length==0 ) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0;
		int j=0;
		
		while(j<b.length && i<a.length) {
			
			if(a[i]==b[j]) {
				j++;
				i++;
			}
			
			else if(a[i] <b[j]) {
				i++;
			}
			
			else {
				return false;
			}
			
		}
		
		return j==b.length;
		
	}

}
