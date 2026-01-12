package DSA.DSAProblems.StackAndQueue;

import java.util.Stack;

public class DailyTemperature {
	
	
	public int[] getTemperature(int[] temperature) {
		int n=temperature.length;
		
		Stack<Integer> stack=new Stack<>();
		int[] result=new int[n];
		for(int i=0; i<n; i++) {
			
			while(!stack.isEmpty() && temperature[i]>temperature[stack.peek()]) {
				
				int index=stack.pop();
				
				result[index]=i-index;
			}
			stack.push(i);
			
		}
		return result;
	}

}
