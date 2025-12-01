package DSA.DSAProblems;

import java.util.Arrays;

public class flowerBlooming {
	  public int minDays(int[] bloomDay, int m, int k) {
		  
		  
		  Arrays.sort(bloomDay);
		  int low=bloomDay[0];
		  
		  int high=bloomDay[bloomDay.length-1];	
		  int ans=0;
		  while(low<high) {
			  
			  int mid=low+(high-low)/2;
			  
			  if(blooming(bloomDay,mid,m,k)==true) {
				  ans=mid;
				  high=mid-1;
			  }else {
				  low=mid+1;
			  }
		  }
		  return ans;
	    }

	private boolean blooming(int[] bloomDay, int mid, int m, int k) {
		int count=0;
		int blooming=0;
		for(int i=0; i<bloomDay.length; i++) {
			
			if(bloomDay[i]<=m) {
				
				count++;
				
				
				
			}else {
				blooming+=count/k;
				count=0;
			}
		}
		blooming+=count/k;
		
		return blooming>=m;
	}
}

