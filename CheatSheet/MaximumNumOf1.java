package Own;

public class MaximumNumOf1 {
	
	public int minRow(int mat[][]) {
        // code here
     	int maxCount=Integer.MAX_VALUE;
		int rowIndex=-1;
		for(int row=0; row<mat.length; row++) {
			
			int count=0;
			
			for(int col=0; col<mat[row].length; col++) {
				
				if(mat[row][col]==1) {
					count++;
				}
			}
			
			if(count<maxCount) {
				maxCount=count;
				rowIndex=row+1;
			}
		}
		return rowIndex;
	}

}
