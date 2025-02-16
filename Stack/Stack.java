package Stack;

public class Stack {
	
	int[] arr;
	int topOfStack; 
	
	public Stack(int size) {
		this.arr= new int[size];
		this.topOfStack=-1;
		System.out.println("The stack is created with size of: "+size);
	}
	
	public boolean isEmpty() {
		if(topOfStack == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(topOfStack ==arr.length-1) {
			System.out.println("Stack is Full");
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full");
			
		}else {
			 arr[topOfStack+1]=value;
			 topOfStack++;
			 System.out.println("The value is SuccessFully Inserted");
			 
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("The stack is Empty");
			return -1;
		}else {
			int topStack=arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The stack is Empty");
			return -1;
		}else {
			int topStack=arr[topOfStack];
			return topStack;
		}
	}
	
	public void deleteStack() {
		arr=null;
		System.out.println("Stack is SuccessFully Deleted");
	}

}
