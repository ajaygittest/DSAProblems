package dsaProblems;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("4");
		stack.push("3");
		stack.push("5");
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
