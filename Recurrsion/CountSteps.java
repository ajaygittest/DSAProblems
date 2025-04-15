package Recurrssion;

public class CountSteps {
	
	
	public static void main(String[] args) {
		
	}
	
	
	public int base(int num) {
		
		return steps(num,0);
	}


	private int steps(int num, int steps) {
		
		if(num==0) {
			return steps;
		}
		
		if(num%2==0) {
			return steps(num/2,steps+1);
		}
		
		return steps(num-1,steps+1);
	}

}
