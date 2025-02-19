package Recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(12,8));
	}
	
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		
		return GCD(b,a%b);
	}

}
