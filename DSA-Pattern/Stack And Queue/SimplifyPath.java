package DSA.DSAProblems.Stack;

import java.util.Stack;

public class SimplifyPath {
	
	
	public String simplfiyPath(String s) {
		
		Stack<String> stack =new Stack<>();
		
		String[] path=s.split("/");
		
		for(String p:path) {
			
			if(p.equals(".") || p.equals("")) {
				continue;
			}
			if(p.equals("..")) {
				stack.pop();
			}else {
				stack.push(p);
			}
			
		}
		if(stack.isEmpty()) {
			return "/";
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(String s1:stack) {
			sb.append("/").append(s1);
		}
		
		return sb.toString();
	}

}
