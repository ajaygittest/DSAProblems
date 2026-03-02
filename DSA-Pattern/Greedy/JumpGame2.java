package DSA.DSAProblems.Greedy;

public class JumpGame2 {
	
	
	
	public int jump(int[] nums) {
		int n=nums.length;
		
		int maxJump=0;
		
		int end=0;
		
		int ans=0;
		
		for(int i=0; i<n; i++) {
			maxJump=Math.max(maxJump, nums[i]+i);
			
			if(maxJump>=n-1) {
				ans++;
				return ans;
			}
			if(end==i) {
				ans++;
				end=maxJump;
			}
		}
		return ans;
	}
	

}
