package DeleteLinkedList;

import java.util.HashSet;

public class Questions {

	void deleteLinkedList(LinkedList list) {
		
		HashSet<Integer> set = new HashSet<>();
		Node current =list.head;
		Node prev=null;
		
		while(current !=null) {
			int currValue= current.value;
			
			if(set.contains(currValue)) {
				prev.next=current.next;
				list.size--;
			}else {
				set.add(currValue);
				prev=current;
			}
			current=current.next;
		}
	}
	
	LinkedList sumLists(LinkedList lla, LinkedList llb) {
		Node n1 = lla.head;
		Node n2=llb.head;
		int carry=0;
		
		 LinkedList resultll= new LinkedList();
		 
		 while(n1 !=null || n2 !=null) {
			 int result= carry;
			 if(n1 !=null) {
				 result +=n1.value;
				 n1=n1.next;
			 }
			 if(n2 !=null) {
				 result +=n2.value;
				 n2=n2.next;
			 }
			 
			 resultll.insertNode(result%10);
			 carry=result/10;
		 }
		 return resultll;
	}
}
