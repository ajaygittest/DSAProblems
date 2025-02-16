package Stack;

public class Main {
	
	public static void main(String args[]) {
		Stack neStack = new Stack(4);
		System.out.println(neStack.isEmpty());
		neStack.push(2);
		System.out.println(neStack.pop());
	}
	
}
