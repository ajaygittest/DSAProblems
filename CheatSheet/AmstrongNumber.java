package Own;

public class AmstrongNumber {
	
	
	public static void main(String[] args) {
		
		
	}
	
	
	public static boolean amstrong(int n) {
		int ans=0;
		int og=n;
		int digits=counts(n);
		while(n!=0) {
			
			int a=n%10;
			ans+=power(a,digits);
			n=n/10;
		}
		return og==ans;
	}


	private static int counts(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}


	private static int power(int base,int power) {
		int ans=1;
		for(int i=0; i<power; i++) {
			ans*=base;
		}
		return ans;
	}

}
