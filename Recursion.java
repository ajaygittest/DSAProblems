package dsaProblems;

public class Recursion {
	
	
	public static void main(String args[]) {
		
		//walk(5);
		//System.out.println(factorial(7));
		
		System.out.println(power(2,8));
	}

	private static int power(int base, int exponent) {
		if(exponent <1) return 1;
		return base * power(base, exponent-1);
		
	}

	private static int factorial(int num) {
		
		if(num <1) return 1;
		return num*(factorial(num-1));
		
		
	}

	private static void walk(int step) {
		
		if(step <1) return; 
			System.out.println("You are in step"+step);
			walk(step-1);
			
		
		
	}

}
