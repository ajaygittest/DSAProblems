package Own;

public class PowerOfNumber {
	
	
	public static void main(String[] args) {
		System.out.println(18%12);
	}
	
	public static int power(int base,int exponent) {
		
		
		int result=0;
		
		while(exponent>0) {
			
			if(exponent %2==1) {
				result=result*base;
			}
			
			base*=base;
			exponent=exponent/2;
		}
		return result;
	}
	
	public static int reverse(int n) {
		int reverse=0;
		while(n>0) {
			
			reverse=reverse*10+(n%10);
			n=n/10;
			
		}
		return reverse;
	}

}
