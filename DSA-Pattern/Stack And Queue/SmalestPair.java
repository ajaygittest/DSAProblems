package DSA.DSAProblems.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmalestPair {

	public List<List<Integer>> findSmalestPair(int[] num1, int[] num2, int k) {

		List<List<Integer>> result = new ArrayList<>();
		if (num1.length == 0 || num2.length == 0 || k == 0) {
			return result;
		}

		PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

		for (int i = 0; i < num1.length; i++) {
			queue.offer(new int[] { num1[i] + num2[0], i, 0 });
		}

		while (k > 0 && !queue.isEmpty()) {

			int[] temp = queue.poll();

			int currSum = temp[0];
			int i = temp[1];
			int j = temp[2];

			result.add(Arrays.asList(num1[i], num2[j]));
			k--;

			if (j + 1 < num2.length) {
				int newSum = num1[i] + num2[j + 1];
				queue.offer(new int[] { newSum, i, j + 1 });
			}
		}
		return result;

	}

}
