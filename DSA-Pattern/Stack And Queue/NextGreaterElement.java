package DSA.DSAProblems.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
	
	
	
	
	public int[] greaterElement(int[] num1, int[] num2) {
		Stack<Integer> stack= new Stack();
		
		Map<Integer, Integer> map=new HashMap<>();
		
		int[] res=new int[num1.length];
		
		for(int n:num2) {
			
			while(!stack.isEmpty()&& n>stack.peek()) {
				map.put(stack.pop(), n);
			}
			stack.push(n);
		}
		
		while(!stack.isEmpty()) {
			map.put(stack.pop(), -1);
		}
		
		for(int i=0; i<num1.length; i++) {
			res[i]=map.get(num1[i]);
		}
		
		return res;
	}

}
