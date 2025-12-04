package DSA.DSAProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int remain=nums[i]-target;
			
			if(map.containsKey(remain)) {
				return new int[] {map.get(remain),nums[i]};
			}
			map.put(remain, i);
		}
		return new int[] {-1,-1};
	}

}
