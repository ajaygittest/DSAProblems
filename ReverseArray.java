package dsaProblems;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		reverseArray();
	}
	
	
	public static void reverseArray() {
		
		int[] input= {2,4,5,6,8};
		int start=0;
		int end=input.length-1;
		
		while(start<end) {
			swap(input,start,end);
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(input));
	}


	private static void swap(int[] input, int start, int end) {
		
		int temp=input[end];
		input[end]=input[start];
		input[start]=temp;
		
	}

}
