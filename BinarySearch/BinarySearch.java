package dsaProblems;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		int array[]=new int[100];
		int target=42;
		for(int i=0; i<array.length; i++) {
			array[i]=i;
		}
		//int index =Arrays.binarySearch(array, target);
		
		int index =binarySearch(array, target);
		System.out.println(index);
	}
//code implementation
	private static int binarySearch(int[] array, int target) {
		int low =0;
		int high =array.length-1;
		
		while(low <=high) {
			int middle=low+(high-low)/2;
			int value=array[middle];
			System.out.println(middle+"Value");
			
			if(value<target) {
				low =middle+1;
			}else if(value > target) {
				high=middle-1;
			}else {
				return middle;
			}
		}
		return -1;
	}

}
