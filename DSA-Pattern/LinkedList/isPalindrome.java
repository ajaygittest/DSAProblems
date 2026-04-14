package DSA.DSAProblems.linkedList;



public class isPalindrome {
	public boolean isPalindrome(Node head) {
		
		if(head==null && head.next ==null) {
			return false;
		}
		
		
		Node fast=head;
		Node slow=head;
		
		
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node second=reverse(slow);
		
		Node first=head;
		
		while(second!=null) {
			
			if(first.value !=second.value) {
				return false;
			}
			first=first.next;
			second=second.next;
		}
		
		return true;
		
		
		
		
	}

	private Node reverse(Node slow) {
		Node prev=null;
		
		Node current=slow;
		
		
		while(current !=null) {
			
			Node next=current.next;
			
			current.next=prev;
			
			prev=current;
			current=next;
		}
		
		return prev;
	}
}

