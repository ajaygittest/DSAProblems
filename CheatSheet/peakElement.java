package Own2;

public class peakElement {
	  public int peakElement(int[] arr) {
	        // code here
		  
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
		  return start;
	        
	    }
}

