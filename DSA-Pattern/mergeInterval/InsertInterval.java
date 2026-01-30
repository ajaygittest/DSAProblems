package DSA.DSAProblems.mergeInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	
	
	public int[][] insert(int [][] interval,int[] newInterval){
		int n=interval.length;
		
		List<int[]> res=new ArrayList<>();
		
		int i=0;
		
		while(i<n && interval[i][1]<=newInterval[0]) {
			
			res.add(interval[i]);
			i++;
		}
		
		while(i<n && interval[i][0]<=newInterval[1]) {
			
			newInterval[0]=Math.min(interval[i][0], newInterval[0]);
			newInterval[1]=Math.max(interval[i][1], newInterval[1]);
			i++;
		}
		
		while(i<n) {
			res.add(interval[i]);
			i++;
		}
		
		return res.toArray(new int[res.size()][]);
	}

}
