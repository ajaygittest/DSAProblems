package dsaProblems;

import java.util.Arrays;

public class linearSearchTwoDArray {
	
	public static void main(String args[]) {
		
		int[][] arr= {
				{23,4,1},
				{18,12,3,9},
				{78,99,2,1},
				{18,12}
		};
		int target=2;
		
		//System.out.println(Arrays.toString(Search(arr,target)));
		System.out.println(maxValue(arr));
		
		
	}


	public static int[] Search(int[][] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static int maxValue(int[][] arr) {
		int max=0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col]>max) {
				 max=arr[row][col];
				}
			}
		}
		return max;
	}
}
