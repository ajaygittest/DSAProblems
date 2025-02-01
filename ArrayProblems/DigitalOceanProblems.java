package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DigitalOceanProblems {

	public static void main(String args[]) {
		// System.out.println(isPrime(12));
		// fibonacci(10);
		// palindrome("Madam");
		//System.out.println(FactorialNum(10));
		//reverseLinkList();
		sumofArray();
	//System.out.println(	sameElement());
		
		
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime;
		if(num==0 || num==1) {
			return false;
		}
		if(num==2) {
			return true;
		}
		
		for(int i=2; i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void fibonacci(int inte) {
		
		int a=0;
		int b=1;
		int c=1;
		
		
		for(int i=0; i<inte;i++) {
			System.out.println(a);
			
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static int recursive(int num1) {
		if(num1<=1) {
			return num1;
		}
		return recursive(num1-1)+recursive(num1-2);
	}
	
	public static void palindrome(String input) {
		
	String one=input.toLowerCase();
	String two = new StringBuilder(input.toLowerCase()).reverse().toString();
	System.out.println(one.equals(two));
	}
	
	public static int FactorialNum(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return (num*FactorialNum(num-1));
		}
	}
	
	public static void reverseLinkList() {
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);

		System.out.println(ll);
		
		ll.descendingIterator().forEachRemaining(l2::add);
		System.out.println(l2);
		
	}
	
	public static void sumofArray() {
		
		ArrayList<Integer> input= new ArrayList();
		input.add(1);
		input.add(2);
		input.add(1);
		input.add(2);
		input.add(3);
		//System.out.println(input.stream().mapToInt(Integer::intValue).sum());
		int[] array = { 1, 2, 3, 4, 5 };
		
		//System.out.println(Arrays.stream(array).sum());
		
		
		int inpu=input.stream().distinct().sorted().skip(1).findAny().orElse(0);
		System.out.println(inpu);
			
	}
	
	public static boolean sameElement() {
		
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		Set<Object> first = new HashSet<>(Arrays.asList(a1));
		
		Set<Object> second = new HashSet<>(Arrays.asList(a2));
		
		if(first.size() !=second.size()) {
			return false;
		}
		
		for(Object m:first) {
			if(!second.contains(m)) {
				return false;
			}
		}
		return true;
	}
}
