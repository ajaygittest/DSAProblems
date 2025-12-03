package Own2;

import java.util.Arrays;

public class minEatingSpeed {
	  public int minEatingSpeed(int[] piles, int h) {
		  Arrays.sort(piles);
		  int low=0;
		  int high=piles[piles.length-1];
		  
		  while(low<=high) {
			  
			  int mid=low+(high-low)/2;
			  
			  if(finish(piles,h,mid)) {
				  high=mid;
			  }else {
				  low=mid-1;
			  }
		  }
		  return low;
	        
	    }

	private boolean finish(int[] piles, int h, int mid) {
		
		int hours=0;
		
		for(int p:piles) {
			hours+=(p+mid-1)/mid;
			
			if(hours>h) {
				return false;
			}
		}
		
		return hours<=h;
	}
}

