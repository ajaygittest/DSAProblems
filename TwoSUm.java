package Sample;

import java.util.HashMap;
import java.util.Map;

public class TwoSUm {
	
	 public int[] twoSum(int[] nums, int target) {

	        Map<Integer,Integer> result= new HashMap<>();

	        for(int i=0; i<nums.length; i++){
	            int remainder= target-nums[i];

	            if(result.containsKey(remainder)){
	                return new int[] {result.get(remainder),i};
	            }
	            result.put(nums[i],i);
	            
	        }

	        return new int[] {};
	        
	    }

}
