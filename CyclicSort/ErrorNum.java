package CyclicSort;

import java.util.Arrays;

public class ErrorNum {
	
	public static void main(String[] args) {
		int[] arr= {1,1,3,2};
		System.out.println(Arrays.toString(missingNumber(arr)));
	}
	
	public static int[] missingNumber(int[] arr) {
		int i=0;
		
		while(i<arr.length) {
			int correct=arr[i]-1;
			
			if(arr[i] !=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index] !=index+1) {
				return new int[] {arr[index],index+1};
			}
		}
		return new int[] {-1,-1};
	}

	private static void swap(int[] arr, int i, int correct) {
		int temp=arr[i];
		arr[i]=arr[correct];
		arr[correct]=temp;
		
	}

}
