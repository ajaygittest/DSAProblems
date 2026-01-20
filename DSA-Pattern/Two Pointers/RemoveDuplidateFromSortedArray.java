package DSA.DSAProblems.twoPointers;

public class RemoveDuplidateFromSortedArray {
	
	
	
	
	public int removeDuplicate(int[] nums) {
		
		int n=nums.length;
		
		int j=1;
		
		
		for(int i=1; i<n; i++) {
			
			if(nums[i] !=nums[j-1]) {
				
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}

}
