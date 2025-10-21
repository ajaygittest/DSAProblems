package Own;

import java.util.ArrayList;
import java.util.List;

public class DiagonalMatrix {
	
	public static void main(String[] args) {
		  int[][] mat = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        List<Integer> ans = diagonal(mat);
		        System.out.println(ans);
	}
	
	
	public static List<Integer> diagonal(int[][]arr){
		
		int n=arr.length;
		int m=arr[0].length;
		
		List<Integer> result=new ArrayList<>();
		
		
		
		for(int col=0; col<m; col++) {
			
			int i=0; int j=col;
			
			while(i<n&&j>=0) {
				
				result.add(arr[i][j]);
				i++;
				j--;
			}
		//[1, 2, 4, 3, 5, 7]			
		}
		
		for(int row=1; row<n; row++) {
			
			int i=row; int j=m-1;
			while(i<n && j>=0) {
				result.add(arr[i][j]);
				i++;
				j--;
			}
			
		}
		return result;
	}
	
	  public int[] matrixDiagonally(int[][] arr) {
	        int n=arr.length;
			int m=arr[0].length;
			
			int[] result=new int[n*m];
			
			int index=0;
			
			for(int col=0; col<m; col++) {
				
				int i=0; int j=col;
				
				while(i<n&&j>=0) {
					
					result[index++]=arr[i][j];
					i++;
					j--;
				}
			//[1, 2, 4, 3, 5, 7]			
			}
			
			for(int row=1; row<n; row++) {
				
				int i=row; int j=m-1;
				while(i<n && j>=0) {
					result[index++]=arr[i][j];
					i++;
					j--;
				}
				
			}
			return result;
		}
}
