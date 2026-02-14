package DSA.DSAProblems.Stack;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	
	public int largest(int[] num, int k) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		for(int n:num) {
			queue.offer(n);
			
			if(queue.size()>k) {
				queue.poll();
			}
		}
		return queue.peek();
	}

}
