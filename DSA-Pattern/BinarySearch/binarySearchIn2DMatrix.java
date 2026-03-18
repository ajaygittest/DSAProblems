package DSA.DSAProblems.binarySearch;

public class binarySearchIn2DMatrix {
	
	
	public int searchMatrix(int[][] matrix,int target) {
		
		int m=matrix.length;
		int n=matrix[0].length;
		
		if(m==0) {
			return -1;
		}
		
		int start=0; 
		int end=m*n-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			int element=matrix[mid/m][mid%n];
			
			if(target==element) {
				return mid;
			}else if(target<element) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
		
		
	}

}
