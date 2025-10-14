package Own;

import java.util.Arrays;

public class SieveofEratosthenes {
	 public static void main(String[] args) {
	        int n = 50;  // Find primes up to 50
	        Sieve(n);
	    }
	
	public static void Sieve(int n) {
		
		boolean[] prime=new boolean[n+1];
		
		Arrays.fill(prime, true);
		
		prime[0]=false;
		prime[1]=false;
		
		for(int p=2; p*p<=n; p++) {
			if(prime[p]) {
				
				for(int i=p*p; i<=n; i+=p) {
					prime[i]=false;
				}
			}
		}
		
		for(int i=2; i<n; i++) {
			if(prime[i]) {
			System.out.println(i);	
			}
		}
	}

}
