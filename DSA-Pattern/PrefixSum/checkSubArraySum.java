package DSA.DSAProblems.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class checkSubArraySum {

	public boolean checkSubArraySum(int[] num, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		int sum = 0;
		map.put(0, -1);

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			int reminder = sum % k;

			if (map.containsKey(reminder)) {
				if (i - map.get(reminder) > 1) {
					return true;
				}
			} else {
				map.put(reminder, i);
			}
		}
		return false;
	}

}
