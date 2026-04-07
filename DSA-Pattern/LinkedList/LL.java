package DSA.DSAProblems.FastandSlowPointer;

public class LL {
	
	private Node head;
	
	private Node tail;
	
	private int size;
	
	
	
	
	public LL() {
		this.size=0;
	}
	
	
	
	public void insertFirst(int value) {
		Node node =new Node(value);
		
		node.next=head;
		head=node;
		
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	
	public void inserLast(int value) {
		
		Node node = new Node(value);
		
		if(tail==null) {
			insertFirst(value);
			return;
		}
		
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void reverseLinkedList() {
		
		 Node next=null;
		
		 Node prev=null;
		
		 Node current=head;
		
		
		while(current !=null) {
			
			next=current.next;
			
			current.next=prev;
			
			prev=current;
			current=next;
			
			
		}
		head=prev;
		Node temp=prev;
		while(temp !=null) {
			
			System.out.print(temp.value +"-> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	public boolean detectCyclic() {
		
		Node first=head;
		Node second=head;
		
		while(second !=null && first.next!=null) {
			first=first.next;
			second=second.next;
			
			if(first==second) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void insert(int index, int value) {
		
		if(index==0) {
			insertFirst(value);
			return;
		}
		if(index==size) {
			inserLast(value);
			return;
		}
		
		Node temp=head;
		for(int i=1; i<index; i++) {
			temp=temp.next;
		}
		Node node =new Node(value,temp.next);
		temp.next=node;
		size++;
		
	}
	
	public void display() {
		
		Node temp=head;
		
		while(temp !=null) {
			
			System.out.print(temp.value +"-> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	
	
	public void insertLast() {
		
	}

}
