package LinkedList;

public class Main {
	
	
	public static void main(String args[]) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.creatingSingleLinkedList(5);
		
		sl.insertLinkedList(6, 1);
		sl.insertLinkedList(7, 3);
		sl.insertLinkedList(8, 4);
		sl.insertLinkedList(9, 0);
		sl.traverseSingleLinkedList();
		sl.deleteEntireMethod();
		sl.traverseSingleLinkedList();
		
		
	}

}
