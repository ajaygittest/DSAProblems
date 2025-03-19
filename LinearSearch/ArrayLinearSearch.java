package dsaProblems;

public class ArrayLinearSearch {
	
	public static void main(String args[]) {
		
		int[] arr= {1,3,4,5,6,7,2};
		System.out.println(Search(arr,3));
	}
	
	public static int Search(int[] arr,int target) {
		
		if(arr.length==0) {
			return Integer.MIN_VALUE;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==target) {
				return i;
			}
			
		}
		return Integer.MIN_VALUE;
	}

}
