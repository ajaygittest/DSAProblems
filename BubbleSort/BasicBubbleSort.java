package BubbleSort;

import java.util.Arrays;

public class BasicBubbleSort {
	
	public static void main(String[] args) {
		int[] arr= {1,3,1,3,-5,0,2,5,6,7};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	
	public static int[] bubbleSort(int[] arr) {
		
		boolean swapped = false;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=1; j<arr.length-1; j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		return arr;
	}

}
