package DeleteLinkedList;

public class Main {
	
	public static void main(String args[]) {
//		LinkedList lst= new LinkedList();
//		Questions demo = new Questions();
//		lst.createLinkedList(1);
//		lst.insertNode(2);
//		lst.insertNode(3);
//		lst.insertNode(4);
//		lst.insertNode(4);
//		lst.insertNode(5);
//		lst.traverseLL();
////		demo.deleteLinkedList(lst);
////		lst.traverseLL();
//		System.out.println(lst.nthToLast(lst, 4));
//	}
		
		LinkedList lla = new LinkedList();
		lla.insertNode(7);
		lla.insertNode(1);
		lla.insertNode(6);
		LinkedList llb = new LinkedList();
		llb.insertNode(5);
		llb.insertNode(9);
		llb.insertNode(2);
		Questions demo = new Questions();
		LinkedList result =demo.sumLists(lla, llb);
		result.traverseLL();
		
	}

}
