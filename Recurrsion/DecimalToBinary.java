package Recursion;

public class DecimalToBinary {

	
	public static void main(String args[]) {
		System.out.println(Convertion(6));
	}
	public static int Convertion(int a) {
		if(a==0) {
			return 0;
		}
		return a%2+10*Convertion(a/2);
	}
}

