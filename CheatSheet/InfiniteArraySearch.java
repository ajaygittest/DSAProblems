package DSA.DSAProblems;

public class InfiniteArraySearch {


	
	
	public static int search(int[] arr, int target) {
		
		int start=0;
		
		int end=1;
		
		while(arr[end]<target) {
			
			if(arr[end]<target){
				start=end;
				end=end*2;
				
				
				if(end>=arr.length) {
					end=arr.length-1;
					break;
				}
				
			}
			
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
		return -1;
		
	}
	
}
