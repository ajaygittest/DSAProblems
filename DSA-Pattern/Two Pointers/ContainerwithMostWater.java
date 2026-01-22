package DSA.DSAProblems.twoPointers;

public class ContainerwithMostWater {

	public int maxWater(int[] height) {

		int left = 0;

		int right = height.length;

		int maxArea = 0;

		while (left < right) {

			int currentArea = Math.min(height[left], height[right]) * (left - right);

			maxArea = Math.max(maxArea, currentArea);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}

		}

		return maxArea;
		
		//1,8,6,2,5,4,8,3,7
	}

}
