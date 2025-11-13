package DSA.DSAProblems;

public class AggressiveCows {

	public int aggressiveCows(int[] arr, int k) {

		int n = arr.length;
		int low = 1;
		int high = arr[n - 1] - arr[0];
		int res = 0;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (placeCow(arr, mid, k)) {
				res = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;

	}

	private boolean placeCow(int[] arr, int mid, int k) {

		int count = 1;
		int position = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - position >= mid) {
				count++;
				position = arr[i];
				if (count == k) {
					return true;
				}
			}

			
		}

		return false;
	}

}
