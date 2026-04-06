package DSA.DSAProblems.DynamicProgram;

public class MinimumPathSum {
	
	
	public int minimumSum(int[][] nums, int i, int j, int[][] dp) {
		
		if(i<0 || j<0) {
			return Integer.MAX_VALUE;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][i];
		}
		
		if(i==0 || j==0) {
			return nums[0][0];
		}
		
		int left=minimumSum(nums,i-1,j,dp);
		int right=minimumSum(nums,i,j-1,dp);
		
		return dp[i][j]=Math.min(left, right);
		
		
		
	}

}
