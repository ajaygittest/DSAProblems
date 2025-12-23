package DSA.DSAProblems;

public class findMissingNumber {
	public int findMissingNumber(int[] arr, int n) {

		int xorAll = 0;
		int xorFull = 0;

		for (int p : arr) {
			xorAll ^= p;
		}

		for (int i = 0; i <= n; i++) {
			xorFull ^= i;
		}

		return xorAll ^ xorFull;

	}
}
