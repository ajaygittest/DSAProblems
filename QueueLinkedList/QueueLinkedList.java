package QueueLinkedList;

public class QueueLinkedList {
	
	SingleLinkedList list;
	public QueueLinkedList(){
		list=new SingleLinkedList();
		System.out.println("The Queue SucessFully Created");
	}
	
	public boolean isEmpty() {
		if(list.head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enQueue(int value) {
		list.insertLinkedList(value, list.size);
	}
	
	public int deQueue() {
		int value=-1;
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
		}else {
			value=list.head.value;
			list.deletionOfNode(0);
		}
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			return -1;
		}
		else {
			return list.head.value;
		}
	}
	
	public void deleteQueue() {
		list.head=null;
		list.tail=null;
	}
	

}
