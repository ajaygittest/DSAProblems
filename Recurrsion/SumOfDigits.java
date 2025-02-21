package Recursion;

public class SumOfDigits {
	
	public static void main(String args[]) {
		System.out.println(sumOF(111));
	}
	
	public static int sumOF(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumOF(n/10);
	}
}
