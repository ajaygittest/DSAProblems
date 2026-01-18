package DSA.DSAProblems.twoPointers;

public class TwoSum {

	public int[] twoSum(int[] number, int target) {

		int left = 0;
		int right = number.length - 1;

		int[] ans = new int[2];
		int sum = 0;

		while (left < right) {
			sum = number[left] + number[right];
			if (sum == target) {

				ans[0] = left + 1;
				ans[1] = right + 1;
				return ans;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] { -1, -1 };

	}

}
