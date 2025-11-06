package Own2;

public class MaximumElementInSortedArray {
	
	
	public int maxEleSorted(int[]arr) {
		
		int start=0;
		int end=arr.length-1;
		//[3,4,5,1,2]
		while(start<end) {
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]>arr[end]) {
				start=mid;
			}else {
				end=mid-1;
			}
		}
		return arr[start];
	}

}
