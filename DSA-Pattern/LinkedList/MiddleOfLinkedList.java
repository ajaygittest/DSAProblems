package DSA.DSAProblems.FastandSlowPointer;

public class MiddleOfLinkedList {
	
	
	
	public Node middleLinkedList(Node head) {
		
		
		Node fast=head;
		
		Node slow=head;
		
		while(fast !=null) {
			
			if(fast.next ==null) {
				return slow;
			}
			
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}

}
