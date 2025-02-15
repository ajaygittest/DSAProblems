package DeleteLinkedList;

public class LinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	
	public void createLinkedList(int nodeValue) {
		Node newNode=new Node();
		newNode.value=nodeValue;
		newNode.next=null;
		head=newNode;
		tail=newNode;
		size=1;
	}
	public void insertNode(int nodeValue) {
		if(head == null) {
			createLinkedList(nodeValue);
			return;
		}
		Node newNode = new Node();
		newNode.value=nodeValue;
		newNode.next=null;
		tail.next=newNode;
		tail=newNode;
		size++;
	}
	public void traverseLL() {
		Node tempNode=head;
		for(int i=0; i<size; i++) {
			System.out.print(tempNode.value);
			if(i !=size-1) {
				System.out.print(" -> ");
			}
			tempNode=tempNode.next;
		}
		System.out.println("\n");
	}
	
	Node nthToLast(LinkedList ll, int n) {
		Node p1=ll.head;
		Node p2=ll.head;
		for(int i=0; i<n; i++) {
			if(p2==null) return null;
			p2=p2.next;
		}
		while(p2 !=null) {
				p1=p1.next;
				p2=p2.next;
		}
		return p1;
			
	}
	
	LinkedList partition(LinkedList ll,int x) {
		Node currentNod =ll.head;
		ll.tail=head;
		while(currentNod !=null) {
			Node next = currentNod.next;
			if(currentNod.value <x) {
				currentNod.next=ll.head;
				ll.head=currentNod;
			}else {
				ll.tail.next=currentNod;
				ll.tail=currentNod;
			}
			currentNod=next;
		}
		ll.tail.next=null;
		return ll;
	}
	

}
