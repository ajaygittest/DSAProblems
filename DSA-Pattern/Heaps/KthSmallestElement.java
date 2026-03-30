package DSA.DSAProblems.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	
	
	public int smallestElement(int[][] matrix,int k) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
		
		int n=matrix.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				queue.add(matrix[i][j]);
				if(queue.size()>k) {
					queue.poll();
				}
			}
		}
		return queue.peek();
	}
}
