package Own;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctTriplet {

	public int countTriplet(int arr[]) {
		// code here

		Arrays.sort(arr);
		
		int count=0;
		
		
		for(int i=arr.length-1; i>=2; i--) {
		int l=0;
		int r=i-1;
		while(l<r) {
			if(arr[l]+arr[r]==arr[i]) {
				count++;
				l++;
				r--;
			}else if(arr[l]+arr[r]<arr[i]) {
				l++;
			}else {
				r--;
			}
		}
		
		}
		return count;
		

	}

}
