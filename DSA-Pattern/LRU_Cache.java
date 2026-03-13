import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {

	class Node {

		int value, key;

		Node next;
		Node prev;

		Node(int value, int key) {
			this.value = value;
			this.key = key;
		}
	}

	int capacity;

	Map<Integer, Node> map;

	Node head;

	Node tail;

	LRU_Cache(int capacity) {

		this.capacity = capacity;

		map = new HashMap<>();

		head = new Node(0, 0);
		tail = new Node(0, 0);

		head.next = tail;
		tail.prev = head;

	}
	
	
	int get(int key){
		
		if(!map.containsKey(key)) return -1;
		
		Node node =map.get(key);
		
		remove(node);
		insert(node);
		return node.value;
		
 	}
	
	
	void put(int key,int value) {
		
		if(map.containsKey(key)) {
			
			remove(map.get(key));
		}
		
		
		if(this.capacity==map.size()) {
			
			Node last=tail.prev;
			
			remove(last);
			
			map.remove(last.key);
			
		}
		
		Node node=new Node(key,value);
		insert(node);
		map.put(key, node);
	}
	
	void remove(Node node) {
		
		node.prev.next=node.next;
		
		node.next.prev=node.prev;
	}
	
	void insert(Node node) {
		
		head.next=node.next;
		node.prev=head;
		
		head.next.prev=node;
		head.next=node;
		
	}

}
