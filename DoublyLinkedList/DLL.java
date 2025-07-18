package DoublyLinkedList;

public class DLL {
	
	
	Node head;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next=head;
		node.prev=null;
		if(head !=null) {
		head.prev=node;
		}
		head=node;
	}
	
	public void inserLast(int val) {
		Node node =new Node(val);
		Node last=head;
		node.next=null;
		if(head ==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next !=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
	}
	
	public void display() {
		Node temp=head;
		Node last=null;
		while(temp !=null) {
			System.out.print(temp.val +" -> ");
			last=temp;
			temp=temp.next;
		}
		System.out.println("END");
		
		System.out.println("Print in Rev");
		while(last !=null) {
			System.out.print(last.val +" -> ");
			last=last.prev;
		}
		System.out.println("START");
	}
	
	public void insert(int after, int val) {
		Node p = find(after);
		
		if(p==null) {
			System.out.println("does not exit");
			return;
		}
		Node node = new Node(val);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node.next !=null) {
		node.next.prev=node;
		}
	}
	
	public Node find(int value) {
		Node node = head;
		while(node !=null) {
			if(node.val==value) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	private class Node{
		int val;
		Node next;
		Node prev;
		public Node(int val) {
			super();
			this.val = val;
		}
		public Node(int val, Node next, Node prev) {
			super();
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
	}

}
