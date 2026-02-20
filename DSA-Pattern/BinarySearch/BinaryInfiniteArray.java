package Demo;

public class BinaryInfiniteArray {
	 public int infiniteArray(int[] arr,int target) {
			 
			 int start=0;
			 int end=0;
			 
			 
			 while(arr.length>end &&target>arr[end] ) {
				 int temp=end+1;
				 
				 end=end+(end-start+1)*2;
				 start=temp;
				 if(end>=arr.length) {
					 end=arr.length-1;
				 }
			 }
			 
			 return binaryInfinite(arr,start,end,target);
		 }
	
		private int binaryInfinite(int[] arr, int start, int end,int target) {
			
			
			while(start<=end) {
				int mid=start+(end-start)/2;
				
				
				if(arr[mid]==target) {
					return mid;
				}
				else if(arr[mid]<target) {
					start=mid+1;
				}else {
					end=mid-1;
				}
				
				
			}
			return -1;
		}
}

