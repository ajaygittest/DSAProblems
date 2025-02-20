package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerValue(5,5));
	}
	
	public static int PowerValue(int n,int x) {
		
		if(x==1) {
			return n;
		}
		return n*PowerValue(n,x-1);
	}

}
