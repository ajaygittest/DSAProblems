package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	public static void main(String[] args) {
		int[] arr= {3,2,5,1,6};
		Selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void Selection(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int last=arr.length-i-1;
			
			int maxIndex=getMax(arr,0,last);
			
			swap(arr,maxIndex,last);
		}
	}

	private static void swap(int[] arr, int maxIndex, int last) {
		int temp=arr[maxIndex];
		
		arr[maxIndex]=arr[last];
		arr[last]=temp;
		
	}

	private static int getMax(int[] arr, int i, int last) {
		int max=i;
		for(int j=i; j<=last; j++) {
			if(arr[max]<arr[j]) {
				max=j;
			}
		}
		
		return max;
	}

}
