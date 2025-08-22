package Recurrssion;

import java.util.Arrays;

public class BackTracking {
	
	public static void main(String[] args) {
		
		
		boolean[][] maze= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		
		int[][] path=new int[maze.length][maze[0].length];
		
		printAllPath("",maze,0,0,path,1);
		
	}
	
	
	public static void backTrack(String p, boolean[][] maze, int r, int c) {

		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		if (!maze[r][c]) {
			return;
		}

		maze[r][c] = false;

		if (c < maze[0].length - 1) {
			backTrack(p + "R", maze, r, c + 1);
		}
		if (r < maze.length - 1) {
			backTrack(p + "D", maze, r + 1, c);
		}

		if (r > 0) {

			backTrack(p + "U", maze, r - 1, c);
		}
		if (c > 0) {
			backTrack(p + "L", maze, r, c - 1);
		}

		maze[r][c] = true;
	}
	
	
	
	public static void printAllPath(String p, boolean[][] maze, int r, int c, int[][]path,int step) {

		if (r == maze.length - 1 && c == maze[0].length - 1) {
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println(p);
			return;
		}

		if (!maze[r][c]) {
			return;
		}
		
		path[r][c]=step;

		maze[r][c] = false;

		if (c < maze[0].length - 1) {
			printAllPath(p + "R", maze, r, c + 1,path,step+1);
		}
		if (r < maze.length - 1) {
			printAllPath(p + "D", maze, r + 1, c,path,step+1);
		}

		if (r > 0) {

			printAllPath(p + "U", maze, r - 1, c,path,step+1);
		}
		if (c > 0) {
			printAllPath(p + "L", maze, r, c - 1,path,step+1);
		}

		maze[r][c] = true;
	}

}
