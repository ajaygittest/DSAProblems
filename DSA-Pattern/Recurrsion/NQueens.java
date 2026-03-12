package Recurrsion;

public class NQueens {

	static int N = 4;

	public static void main(String[] args) {
		
		
		int [][] maze=new int[4][4];
		
		if(solve(maze,0)) {
			display(maze);
		}

	}

	private static void display(int[][] maze) {
	
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N; j++) {
				
				if(maze[i][j]==1) {
				System.out.print("Q ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}

	public static boolean solve(int[][] maze, int row) {

		if (row == N) {
			return true;
		}

		for (int col = 0; col < N; col++) {

			if (isSafe(maze, row, col)) {

				maze[row][col] = 1;

				if (solve(maze, row + 1)) {
					return true;
				}
				maze[row][col] = 0;

			}
		}
		return false;

	}

	private static boolean isSafe(int[][] maze, int row, int col) {

		for (int i = 0; i < row; i++) {

			if (maze[i][col] == 1) {
				return false;
			}

		}

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

			if (maze[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j<N; i--, j++) {

			if (maze[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

}
