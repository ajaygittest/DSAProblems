package DSA.DSAProblems.StackAndQueue;

import java.util.Stack;

public class MinStack {
	
	
	private Stack<Integer> stack;
	private Stack<Integer> minstack;
	
	
	public MinStack() {
		
		stack=new Stack();
		minstack=new Stack();
	}

	
	
	public void push(int x) {
		stack.push(x);
		if(stack.isEmpty() || stack.peek()<=x) {
			minstack.push(x);
		}
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minstack.peek();
	}
	
	public void pop() {
		
		if(stack.peek().equals(minstack.peek())) {
			minstack.pop();
		}
		stack.pop();
		
	}
	
	
}
