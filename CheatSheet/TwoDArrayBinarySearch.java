package Own2;

public class TwoDArrayBinarySearch {

	public static void main(String[] args) {

	}

	public boolean searchMatrix(int[][] mat, int x) {

		int n = mat.length;
		int m = mat[0].length;

		int start = 0;
		int end = n * m - 1;

		while (start < end) {
			
			int mid=start+(end-start)/2;
			
			int row=mid/m;
			int col=mid%m;
			if(mat[row][col]<x) {
				start=mid+1;
			}else if(mat[row][col]==x) {
				return true;
			}else {
				end=mid-1;
			}

		}
		return false;

	}

}
