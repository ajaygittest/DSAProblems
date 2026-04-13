package DSA.DSAProblems.linkedList;

public class getIntersectionNode {
	public Node getIntersectionNode(Node headA, Node headB) {
		
		Node fast=headA;
		Node slow=headB;
		
		int fastLen=0;
		int slowLen=0;
		
		
		while(fast !=null) {
			fastLen++;
			fast=fast.next;
		}
		
		while(slow !=null) {
			slowLen++;
			slow=slow.next;
		}
		
		fast=headA;
		slow=headB;
		
		if(fastLen>slowLen) {
			
			for(int i=0; i<fastLen-slowLen; i++) {
				fast=fast.next;
				
			}
		}else if(slowLen>fastLen) {
			for(int i=0; i<slowLen-fastLen; i++) {
				slow=slow.next;
				
			}
		}
		
		
		while(fast!=null && slow !=null) {
			
			if(fast==slow) {
				return fast;
			}
			fast=fast.next;
			slow=slow.next;
		}
		return null;
		
		
	}
}

