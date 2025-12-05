package Own;

public class NextPermutation {
	
	public static void main(String[] args) {
		
	}
	
	// code logic start
	 public void nextPermutation(int[] nums) {
	     
		 int i=nums.length-2;
		 int n=nums.length;
		 
		 
		 while(i>=0&&nums[i]>=nums[i+1])
		 {
			 i--;
		 }
		 
		 if(i>=0) {
			int j=n-1;
			 while(j>=0 && nums[j]<=nums[i]) {
				 j--;
			 }
			 swap(nums,i,j);
		 }
		 
		 reverse(nums,i+1,n-1);
		
		 
	    }


	private void reverse(int[] nums, int start, int end) {
		 while (start < end) {
	            swap(nums, start++, end--);
	        }
		
	}


	private void swap(int[] nums, int start, int end) {
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
		
	}

}
