package DSA.DSAProblems.StackAndQueue;

import java.util.Stack;

public class largeRectangleArea {
	
	
	
	public static int largestRectangleArea(int[] heights) {
		
		int n=heights.length;
		
		int maxArea=0;
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0; i<n; i++) {
			
			if(!stack.isEmpty()&& heights[i]<heights[stack.peek()]) {
				
				int height=heights[stack.peek()];
				
				int weight=stack.isEmpty() ? i: i-stack.peek()-1;
				
				maxArea=Math.max(maxArea, height *weight);
				
				
			}
		}
		
		while(!stack.isEmpty()) {
			int height=heights[stack.peek()];
			
			int weight=stack.isEmpty() ? n: n-stack.peek()-1;
			
			maxArea=Math.max(maxArea, height *weight);
			
		}
		
		return maxArea;
	}

}
