package DSA.DSAProblems;

import java.util.Arrays;

public class RearrangeArrayZero {
	
	
	
	public static void main(String[] args) {
		
	
		int[]arr= {3,5,7,8,0,9,0,0};
		
		int[] result=new int[arr.length];
		int i=0;
		for(int a:arr) {
			
			if(a !=0) {
			result[i]=a;
			i++;
			}
		}
		System.out.println(Arrays.toString(result));
		
	
		
	}

}
