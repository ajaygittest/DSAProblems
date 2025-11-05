package Own2;

public class findKRotation {
	 public int findKRotation(int arr[]) {
	        // Code here
	        
		 int start=0;
		 int mid=0;
		 int end=arr.length-1;
		 
		 while(start<end) {
			 //[5, 1, 2, 3, 4]
			mid =start+(end-start)/2;
			 
			 if(arr[mid]>=arr[start]) {
				 start=mid+1;
			 }else {
				 end=mid-1;
			 }
		 }
		 return mid;
		 
	    }
}

