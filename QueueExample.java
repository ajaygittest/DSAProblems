package dsaProblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String args[]) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("karen");
		queue.offer("chad");
		queue.offer("steve");
		queue.offer("harlod");
		System.out.println(queue);
		
		Queue<Double> priority = new PriorityQueue<Double>(Collections.reverseOrder());
		priority.offer(3.1);
		priority.offer(35.1);
		priority.offer(4.1);
		priority.offer(1.1);
		System.out.println(priority);
	}

}
