package Own;

public class PerfectNumber {
	
	
	public static void main(String[] args) {
		System.out.println(perfect(6));
	}
	
	public static boolean perfect(int n) {
		
	int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum==n;
	}

}
