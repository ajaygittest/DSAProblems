package DSA.DSAProblems;

import java.util.Arrays;

public class shipPackages {

	static int leastWeightCapacity(int[] arr, int n, int d) {

		 int low = Arrays.stream(arr).max().getAsInt(); 
	        int high = Arrays.stream(arr).sum();
		int least=high;
		while (low <= high) {

			int mid = low + (high - low)/2;

			if (isLoad(arr, d, mid)) {
				least=mid;
				high=mid-1;
			} else {
				low=mid+1;
			}
		}
		return least;

	}


	private static boolean isLoad(int[] arr, int d, int mid) {

		
		int daysRequired = 1;
		int countLoad = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (countLoad+arr[i] > mid) {
				daysRequired++;
				countLoad=arr[i];
				if (daysRequired > d) {
					return false;
				}
			} else {
				countLoad+=arr[i];
			}

		}
	
		return true;
	}

}
