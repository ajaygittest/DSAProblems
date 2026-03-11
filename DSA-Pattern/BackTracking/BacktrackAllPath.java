
public class BacktrackAllPath {
	
	public static void main(String[] args) {
		
		
		boolean[][] board= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		
	allPath(board,0,0,"");
	}

	public static void allPath(boolean[][] maze, int r, int c, String p) {

		if (r == maze.length - 1 && c == maze.length - 1) {

			System.out.println(p);
			return;

		}
		
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c]=false;

		if (r < maze.length-1) {
			allPath(maze, r + 1, c, p + "D");
		}

		if (c < maze[0].length-1) {
			allPath(maze, r, c + 1, p+"R");
		}
		if (r > 0) {
			allPath(maze, r - 1, c, p + "U");
		}

		if (c > 0) {
			allPath(maze, r, c - 1, p+"L");
		}
		maze[r][c]=true;
		

	}

}
