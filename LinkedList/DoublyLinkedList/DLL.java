package LinkedList;

public class DLL {
	
	private Node head;
	
	
	
	public void insertFirst(int val) {
		
		Node node=new Node(val);
		
		node.next=head;
		node.prev=null;
		if(head !=null) {
		head.prev=node;
		}
		head=node;
		
	}
	
	public void delete(int val) {
		
		Node node=get(val);
		
		Node p=node.prev;
		
		p.next=node.next;
		node.next.prev=p;
		
	}
	
	public int deleteFirst() {
		
		int val=head.val;
		head=head.next;
		head.prev=null;
		
		return val;
		
	}
	
	public int deleteLast() {
		
		Node temp=head;
		
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		int val=temp.next.val;
		temp.next=null;
		
		return val;
	}
	
	
	public void insert(int index,int val) {
		
		Node node=new Node(val);
		
		Node p=get(index);
		if(p==null) {
			System.out.println("Node doesn't exit");
			return;
		}
		node.next=p.next;
		node.prev=p;
		if(p.next!=null) {
		p.next.prev=node;
		}
		p.next=node;
		
		
		
		
	}
	
	
	public Node get(int val) {
		Node node=head;
		while(node !=null) {
			if(node.val==val) {
				return node;
				
			}
			node=node.next;
		}
		return null;
	}
	
	public void insertLast(int val) {
	
	Node node =new Node(val);
	Node temp=head;
	
	if(temp ==null) {
		head=node;
		node.prev=null;
		return;
	}
	
	while(temp.next !=null) {
		
		temp=temp.next;
	}
	
	temp.next=node;
	node.prev=temp;
	node.next=null;
	
	
	
	}
	
	
	public void display() {
		Node temp=head;
		Node tail=null;
		
		while(temp !=null) {
			System.out.print(temp.val+"->");
			tail=temp;
			temp=temp.next;
		}
		System.out.println("END");
		
		while(tail!=null) {
			
			System.out.print(tail.val+"->");
			tail=tail.prev;
		}
		System.out.println("START");
	}
	
	public class Node{
		
		int val;
		
		Node next;
		
		Node prev;
		public Node(int val) {
			this.val=val;
		}
		public Node(int val, Node next,Node prev) {
			this.next=next;
			this.val=val;
			this.prev=prev;
		}
		
	}

}
