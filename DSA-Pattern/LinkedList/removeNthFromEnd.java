package DSA.DSAProblems.linkedList;

public class removeNthFromEnd {
	public Node removeNthFromEnd(Node head, int n) {
			
			
			Node dummy=new Node(0);
			dummy.next=head;
			
			Node fast=dummy;
			Node slow=dummy;
			
			for(int i=1; i<n+1; i++) {
				fast=fast.next;
			}
			
			//1 2 3 4 6
			
			while(fast !=null) {
				fast=fast.next;
				slow=slow.next;
			}
			
			slow.next=slow.next.next;
			
			return dummy.next;
			
		}
}

