package DSA.DSAProblems.binarySearch;

public class CapacityToShipPackages {

	
	
	
	public int shipDays(int[] arr, int days) {
		
		int low=getMax(arr);
		int high=getSum(arr);
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			if(getCapacity(arr,arr[mid],days)) {
				high= mid;
			}else {
				low=mid+1;
			}
		}
		return low;
		
	}
	
	public boolean getCapacity(int[] arr,int currentCapacity,int totalCapacity) {
		int load=0;
		int count=0;
		for(int w:arr) {
			
			if(load+w>currentCapacity) {
				count++;
				load=0;
			}
			load+=w;
			
		}
		
		if(count>totalCapacity) {
			return false;
		}
		
		return true;
			
		
	}
	
	
	public int getMax(int[] arr) {
		
		int max=0;
		
		for(int w:arr) {
			max=Math.max(w, max);
		}
		
		return max;
	}
	
	public int getSum(int[] arr) {
		
		int sum=0;
		
		for(int w:arr) {
			sum+=w;
		}
		return sum;
	}
	
}
