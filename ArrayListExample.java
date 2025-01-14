package dsaProblems;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
	
	public static void main(String args[]) {
	ArrayList<Integer> array = new ArrayList<Integer>();
	LinkedList<Integer> linkList = new LinkedList<Integer>();
	Long startTime;
	Long endTime;
	Long elapseTime;
	
	for(int i =0; i<100000;i++) {
		linkList.add(i);
		array.add(i);
	}
	
	startTime = System.nanoTime();
	
	linkList.remove(1000);
	endTime=System.nanoTime();
	elapseTime=endTime-startTime;
	
	System.out.println("LinkList\t"+elapseTime);
	
	startTime = System.nanoTime();
	
	array.remove(1000);
	endTime=System.nanoTime();
	elapseTime=endTime-startTime;
	
	System.out.println("ArrayList\t"+elapseTime);
	}

}
