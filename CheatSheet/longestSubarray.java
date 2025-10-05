package Own;

import java.util.HashMap;
import java.util.Map;

public class longestSubarray {

	public static void main(String[] args) {

	}

	public int longestSubarray(int[] arr, int k) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			if(arr[i]==k) {
				max=1;
			}
			for (int j = i + 1; j < arr.length; j++) {

				sum += arr[j];
				if (sum == k) {
					if(max<(j-i+1)) {
					max = j-i+1;
					}
				}
			}

		}
		return max;

	}
	
	
	//optimize solution
	
	public int LongestSubarray(int[] arr, int k) {
		
		int sum=0;
		int max=0;
		Map<Integer,Integer> result=new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			
			sum+=arr[i];
			if(result.containsKey(sum-k)) {
				
				int prev=result.get(sum-k);
				max=Math.max(max, i-prev);
			}
			
			if(!result.containsKey(sum)) {
				result.put(sum,i);
			}
			
		}
		return max;
	}
	
	
	

}
