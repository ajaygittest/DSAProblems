package DSA.DSAProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParanthesis {
	
	
	
	public static void main(String[] args) {
		String s="t@#$1e@#$%2s@#$%t3t4";
		
		String numStr=s.replaceAll("[^a-zA-Z0-9]", "");
		
		String str=numStr.replaceAll("[0-9]", "");
		String num=numStr.replaceAll("[a-zA-Z]", "");

StringBuilder sb = new StringBuilder();
sb.append(str).append(num);
		
		System.out.println(sb);
		
		
		List<String> list=new ArrayList<>(Arrays.asList("123","0","djdl","78937","dkkd"));
		
		List<String> m=list.stream().filter(f->f.matches("^\\d+$")).collect(Collectors.toList());
		System.out.println(m);
	}
	
	public static boolean validate(String s) {
		
		if(s.length()<1) {
			return false;
		}
		
		
		Stack<Character> set = new Stack<>();
		
		for(char c:s.toCharArray()) {
			
			
			if(c=='(' || c=='[' || c=='{') {
				set.add(c);
			}else if(!set.empty()&&c==')' && set.peek()=='(') {
				set.pop();
			}else if(!set.empty()&&c=='}' && set.peek()=='{') {
				set.pop();
			}else if(!set.empty()&&c==']' && set.peek()=='[') {
				set.pop();
			}else {
				return false;
			}
		}
		return set.isEmpty();
	}

}
