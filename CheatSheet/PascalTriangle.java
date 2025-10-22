package Own;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PascalTriangle {
	
	Map<String,Integer> memo= new HashMap<>();

	  ArrayList<Integer> nthRowOfPascalTriangle(int n) {
	     
			ArrayList<Integer> result=new ArrayList<>();
			
			for(int k=0; k<=n; k++) {
				result.add(helper(n,k));
			}
			return result;
	    }

	private int helper(int n, int k) {
	
		if(k==0 || k==n) {
			return 1;
		}
		
		String key=n+","+k;
		if(memo.containsKey(key)) {
			return memo.get(key);
		}
		int val=helper(n-1,k-1) + helper(n-1,k);
		memo.put(key, val);
		return val;
	}

}
