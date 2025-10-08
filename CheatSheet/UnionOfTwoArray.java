package Own;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> findUnion(int[] a, int[] b) {
		// code here

		Set<Integer> result = new HashSet<>();

		for (int a1 : a) {
			result.add(a1);
		}

		for (int b1 : b) {

			if (!result.contains(b1)) {
				result.add(b1);
			}
		}

		return new ArrayList<>(result);

	}

}
