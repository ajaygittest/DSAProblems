package Own2;

public class findMaxRow1s {
	   public int[] findMaxRow(int mat[][], int N) {
	        // code here
		   
		   return findMax(mat,N);
	        
	    }

	private int[] findMax(int[][] mat, int n) {
		int count_max=-1;
		int index=-1;
		for(int i=0; i<n; i++) {
			int count_row=n-binarySearch(mat[i],n,1);
			
			if(count_row>count_max) {
				count_max=count_row;
				index=i;
			}
		}
		
	
		
		return new int[]{count_max,index};
	}
	
	private int binarySearch(int[]arr,int n,int x) {
		int low=0;
		int high=n-1;
		int ans=n;
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]<=x) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
}

