package CircularLinkedList;

public class Main {
	public static void main(String args[]) {
		CircularLinkedList csll = new CircularLinkedList();
		csll.createCLL(5);
		csll.insertCLL(4, 0);
		csll.insertCLL(6, 1);
		csll.insertCLL(7, 8);
		csll.tranverseCSLL();
	}

}
