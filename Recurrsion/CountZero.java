package Recurrssion;

public class CountZero {

	public static void main(String[] args) {
		
		System.out.println(base(1234000005));
	}
	
	
	public static int base(int num) {
		
		
		return counts(num,0);
	}


	private static int counts(int num, int c) {
		
		if(num==0)
		return c;
		
		int rem=num%10;
		
		if(rem==0) {
			return counts(num/10,c+1);
		}
		return counts(num/10,c);
		
	}

}
