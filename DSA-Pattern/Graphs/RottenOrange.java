package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {

	public int rotten(int[][] grid) {

		int m = grid.length;
		int n = grid.length;

		Queue<int[]> queue = new LinkedList<>();

		int fresh = 0;
		int time = -1;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (grid[i][j] == 2) {
					queue.add(new int[] { i, j });
				}
				if (grid[i][j] == 1) {
					fresh++;
				}
			}
		}

		if (fresh == 0) {
			return 0;
		}
		if (queue.isEmpty()) {
			return -1;
		}
		
		int[][] direction= {{0,1},{0,-1},{1,0},{-1,0}};
		
		while(!queue.isEmpty()) {
			
			int size=queue.size();
			
			while(size>0) {
				int[] cur=queue.poll();
				
				int row=cur[0];
				int col=cur[1];
				
				for(int[] dir:direction) {
					int newRow=row+dir[0];
					int newCol=col+dir[1];
					
					if(newRow>=0 &&newCol>=0 &&newRow<m &&newCol<n&&grid[newRow][newCol]==1) {
						grid[newRow][newCol]=2;
						queue.add(new int[] {newRow,newCol});
						fresh--;
					}
				}
				size--;
			}
			time++;
		}
		
		if(fresh==0) {
			return time;
		}else {
			return -1;
		}

	}

}
