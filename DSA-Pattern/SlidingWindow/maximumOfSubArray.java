package DSA.DSAProblems.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class maximumOfSubArray {

	public int maxSumSubArray(int[] nums, int k) {

		int curMax = 0;
		int maxSum = 0;
		int left = 0;

		Set<Integer> set = new HashSet<>();

		for (int right = 0; right < nums.length; right++) {

			while (set.contains(right) || set.size() == k) {

				set.remove(nums[left]);

				curMax -= nums[left];
				left++;

			}

			curMax += nums[right];
			set.add(nums[right]);

			if (set.size() == k) {

				maxSum = Math.max(maxSum, curMax);
			}
		}
		return maxSum;
	}

}
