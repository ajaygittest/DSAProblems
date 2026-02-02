package DSA.DSAProblems.mergeInterval;

import java.util.Arrays;

public class mergeInteval {
	
	
	
	public int[][] merge(int[][] interval){
		Arrays.sort(interval, (a,b)->Integer.compare(a[0], b[0]));
		
		int n=interval.length;
		
		int[][] res=new int[n][2];
		
		res[0]=interval[0];
		
		int e=0;
		
		for(int i=1; i<n; i++) {
			
			if(res[0][1]<=interval[i][1]) {
				
				res[e][1]=Math.max(res[e][i], interval[i][1]);
			}else {
				e++;
				res[e]=interval[i];
			}
		}
		return res;
	}

}
