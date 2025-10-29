package Own;

public class MatrixRotate {

	public void rotateMatrix(int[][] mat) {
		int n=mat.length;
		for (int row = 0; row < mat.length; row++) {

			for (int col = row+1; col < mat[row].length; col++) {
				
				swap(mat,row,col);

			}

		}
		
		for(int col=0; col<n; col++) {
		int top=0;
		
		int bottom=mat.length-1;
		
		while(top<bottom) {
			swapRow(mat,top,bottom,col);
			top++;
			bottom--;
		}
		}
	}

	private void swapRow(int[][] mat, int top, int bottom, int col) {
		int temp = mat[top][col];
		mat[top][col] = mat[bottom][col];
		mat[bottom][col] = temp;

		
	}

	private void swap(int[][] mat, int start, int end) {
		
		int temp=mat[start][end];
		
		mat[start][end]=mat[end][start];
		mat[end][start]=temp;
		
	}

}
