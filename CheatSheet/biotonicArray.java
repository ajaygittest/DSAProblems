package Own2;

public class biotonicArray {
	
	public int biotonic(int[]arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		int peak=start;
		end=peak;
		start=0;
		
		if(arr[peak]==target) {
			return peak;
		}
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]<target) {
				start=mid+1;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		
		end=arr.length-1;
		start=peak;
		//decreasing
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]<target) {
				
				end=mid-1;
			}else if(arr[mid]>target) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}

}
