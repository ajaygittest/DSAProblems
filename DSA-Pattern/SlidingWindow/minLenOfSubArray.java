package DSA.DSAProblems.SlidingWindow;

public class minLenOfSubArray {

	public int minLenOfSubArray(int[] nums, int target) {

		int minLen = 0;
		int left = 0;
		int curSum = 0;

		for (int right = 0; right < nums.length; right++) {
			curSum += nums[right];

			while (curSum >= target) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;

				}
				curSum -= nums[left];
				left++;
			}
		}
		return minLen;
	}

}
