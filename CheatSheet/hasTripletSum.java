package Own;

import java.util.Arrays;

public class hasTripletSum {
	public boolean hasTripletSum(int arr[], int target) {
	    // code Here
	    if(arr.length==0){
	        return false;
	    }
	
	
	  Arrays.sort(arr);
	
	
	  for(int i=0; i<arr.length-1; i++){
	      
	      int left=i+1;
	      
	      int right=arr.length-1;
	      
	while (left < right) {  
	      int sum=arr[i]+arr[left]+arr[right];
	      if(target==sum){
	          return true;
	      }else if(sum<target){
	          left++;
	      }
	      else{
	          right--;
	      }
	}
	      
	      
	      
	  }
	
	    return false;
	}
}

